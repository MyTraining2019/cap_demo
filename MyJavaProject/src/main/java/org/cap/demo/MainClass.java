package org.cap.demo;

public class MainClass {

	public static void display(){
		System.out.println("Hey!");
	}
	
	public static void main(String[] args) {
		display();
		
		SalesClass class1=new SalesClass();
		class1.show();
	}

}
