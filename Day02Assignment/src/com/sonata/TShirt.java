package com.sonata;

public class TShirt {
	String Color;
	String Material;
	String Design;
	public void display()
	{
		System.out.println(Color);
		System.out.println(Material);
		System.out.println(Design);
		
		}
	public static void main(String args[])
	{
		System.out.println("Small size ");
		TShirt small=new TShirt();
		small.Color="Red";
		small.Material="cotton";
		small.Design="Formal";
		small.display();
		
        System.out.println("Large size  ");
		TShirt large=new TShirt();
		large.Color="Green";
		large.Material="Silk";
		large.Design="Round Neck";
		large.display();
		
		System.out.println("Extra large ");
		TShirt Xtralarge=new TShirt();
		Xtralarge.Color="Orange";
		Xtralarge.Material="Nylon";
		Xtralarge.Design="Collar";
		Xtralarge.display();
		
	}

}


