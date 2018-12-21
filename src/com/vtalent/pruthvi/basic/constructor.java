package com.vtalent.pruthvi.basic;

public class constructor {
static String name;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
constructor(){
	System.out.println("Donkey Eggu");
	}
constructor(String t){
	this.name = t;
	}
public static void main(String [] args){
constructor python = new constructor();
constructor java = new constructor();
python.setName("Python");
 java.getName();
 python.getName();
System.out.println("languages :" + name);
}
}