package com.vtalent.narendar;

final class MySystem {
	
	private MySystem(){}
	static MyPrintStream out=new MyPrintStream(new MyOutputStream(){
		
		public void console(){}
		
	});
}
