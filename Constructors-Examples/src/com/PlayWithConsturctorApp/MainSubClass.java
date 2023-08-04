package com.PlayWithConsturctorApp;

public class MainSubClass extends MainSuperClass
{
	String name;
	MainSubClass()
	{
		this(23);
		System.out.println("I'm MainSubClass Constructor with zero perameter...");
	}
	MainSubClass(int i)
	{
		System.out.println("I'm MainSubClass Constructor with one perameter...");
	}
	public static void main(String[] args) 
	{
		MainSubClass msc=new MainSubClass();
		msc.name="babua";
	}
	
}
