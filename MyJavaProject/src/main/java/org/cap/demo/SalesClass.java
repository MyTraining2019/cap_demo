package org.cap.demo;

public class SalesClass {
	int mydata[]={12,45,67};
	
	public void show(){
		int sum=0;
		for(int i=0;i<mydata.length;i++){
		
			sum+=i;
			System.out.println(i);
			sum=sum+1000;
		}
		
		System.out.println("Sum Value:" + sum);
	}

}
