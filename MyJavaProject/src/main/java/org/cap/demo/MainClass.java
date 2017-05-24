package org.cap.demo;

public class MainClass {

	public static void display(){
		System.out.println("Hey!");
		
		System.out.println("Greetings! Good After Noon!");
	}
	
	public static void main(String[] args) {
		display();
		display();
		SalesClass class1=new SalesClass();
		class1.show();
	}

}
