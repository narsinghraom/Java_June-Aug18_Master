package com.hrm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hrm.bean.DaoImpl;
import com.hrm.bean.EmployeeBean;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Reading the client values
		String employeeId=request.getParameter("employeeId");
		String employeeName=request.getParameter("employeeName");
		String employeeSalary = request.getParameter("employeeSalary");
		//inject client reading values into Encapsulation object
		EmployeeBean employeeBean=new EmployeeBean();
		if(employeeId!=null && !employeeId.isEmpty()){
			employeeBean.setEmployeeId(Integer.parseInt(employeeId));
		}
		employeeBean.setEmployeeName(employeeName);
		if(employeeSalary!=null && !employeeSalary.isEmpty()){
			employeeBean.setEmployeeSalary(Double.parseDouble(employeeSalary));
		}
		//Calling the DAO layer by passing the encapsulation object
		DaoImpl dao=new DaoImpl();
		int result=dao.insertDataOfAnEmployee(employeeBean);
		
		//passing to another page
		RequestDispatcher dispacter=request.getRequestDispatcher("Sucess.html");
		
		if(result>0){
			dispacter.forward(request, response);
		}
		
		
	}

}
