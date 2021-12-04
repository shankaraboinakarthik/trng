package com.sonata;

public class StudentObject {
	int stdId;
	String stdName;
	int stdClass;
	StudentObject(int a,String b,int c){
		this.stdId=a;
		this.stdName=b;
		this.stdClass=c;
	}
	public void display() {
		System.out.println(stdId);
		System.out.println(stdName);
		System.out.println(stdClass);
	}
	public static void main(String args[]) {
		StudentObject s=new
		StudentObject(48,"Karthik",4);
		s.display();
		StudentObject s1=new
		StudentObject(34,"Kittu",5);
		s1.display();
	}
	
}
