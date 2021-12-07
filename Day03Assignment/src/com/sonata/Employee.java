package com.sonata;

	public class Employee extends MyOwnException implements MyInterface{
		int  empId;
		String empName;
		double empSal;
		
		public Employee(int id, String name, double sal, String a) {
			super(a);
			this.empId = id;
			this.empName = name;
			this.empSal = sal;
			
		}
		
		public void display() {
			System.out.println("Employee id is : "+empId);
			System.out.println("Employee Name : "+empName);
			System.out.println("Employee Salary : "+empSal);
		}


		@Override
		public void saCal() throws MyOwnException 
		{
			
			double yearlySal = empSal * 12;
			
				if(yearlySal < 300000)
				{
					throw new MyOwnException(" lessthan 1 lakh");
				}else 
				{
					System.out.println("greaterrthan 1 lakh");
				}
		
		}
		public static void main(String[] args) throws MyOwnException 
		{
			Employee emp = new Employee(21275, "Karthik", 26584 , "hello");
			emp.display();
			emp.saCal();
			
		}
		
	}


