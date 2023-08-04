package com.PlayWithConsturctorApp;

public class CoconutTree extends Tree
{
	double price;
	
		CoconutTree()
		{
			this(50);
			System.out.println("Gama");
		}
		CoconutTree(double d)
		{
			System.out.println("I am double-Constructor");
		}
		CoconutTree(int i)
		{
			System.out.println("Alpha");
		}
		
		public static void main(String[] args)
		{
			CoconutTree c=new CoconutTree();
		}
		
}
