package com.PlayWithConsturctorApp;

public class Family extends BigFamily //Sub-Class
{
	Family()
	{
		super(); // ----> Super Class Constructor...
		System.out.println("I'am Sub-Class / Family-Class Constructor...");
	}
	public static void main(String[] args) 
	{
		Family f=new Family();
	}
}
