package com.vtalent.kalyani.basics;

public class Test3 {

	public static void main(String[] args) {
		Third1 t=new Third1();
		t.function(10, 20);
		
		// t=new second1();
		t.function(10, 20);
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Type mismatch: cannot convert from second1 to Third1

			at com.vtalent.kalyani.basics.Test3.main(Test3.java:9)*/

		
	// t= new First1();
	t.function(2);
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Type mismatch: cannot convert from First1 to Third1

			at com.vtalent.kalyani.basics.Test3.main(Test3.java:12)*/

		
	}

}
