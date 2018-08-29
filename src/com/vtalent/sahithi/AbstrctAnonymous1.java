package com.vtalent.sahithi;

public class AbstrctAnonymous1 {
	
		
		/*public void function( AbstrctAnonymous a){
		a.function(5);
		}*/
		public static void main(String[] args) {
			
		 AbstrctAnonymous A=new  AbstrctAnonymous(){
		 
		 
			 public void function(int i){
				 System.out.println(i);
			 }
		 };
		 A.function(5);
		 
	}
	
	

}
