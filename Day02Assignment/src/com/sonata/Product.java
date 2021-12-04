package com.sonata;

public class Product {
	int proId;
	String proName;
	double proPrice;
	
	Product()
	{
		
	}
	
	
	
	 public double add(double GST)
	 {
		 proPrice=proPrice+GST;
		 return proPrice;
	 }
	
	
	public void display()
	{
		System.out.println(proId);
		System.out.println(proName);
		System.out.println(proPrice);
	}


public static void main(String args[])
{
	Product p = new Product();
	p.proId= 48;
	p.proName = "Mobile";
	p.proPrice = 48000;
	p.display();
	System.out.println(p.add(18));
	
	
}

}