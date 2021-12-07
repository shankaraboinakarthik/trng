package com.sonata;

	public class UsingPeople {

		public static void main(String[] args) {
			
		
			TechnicalEmployee T = new TechnicalEmployee(21266, "Srikanth", "Jangoan", 26000, 8);
			
			Staff S = new Staff(21275, "Karthik", "Mahabubabad", 29000, 4);
			
			T.display();
			System.out.println("Technical Employee Sal is : "+T.calculateSal());
			
			System.out.println("\n");
			S.display();
			System.out.println("Staff Sal is : "+S.calculateSal());
			
		}


	}


