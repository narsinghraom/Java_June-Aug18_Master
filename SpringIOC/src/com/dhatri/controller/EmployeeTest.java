package com.dhatri.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.dhatri.bean.Admin;
import com.dhatri.bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(resource);  
          
        Employee employee=(Employee)factory.getBean("employeeObj");  
        System.out.println(employee.getEmployeeId() + " "+ employee.getEmployeeName() + " "+employee.getEmployeeSalary());
        Admin admin = (Admin)factory.getBean("adminObj");
        System.out.println(admin);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationCOntext.xml");
        Admin adminRef = (Admin)context.getBean("adminObj");
        System.out.println(adminRef);

	}

}
