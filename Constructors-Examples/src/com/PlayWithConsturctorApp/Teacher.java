package com.PlayWithConsturctorApp;
public class Teacher 
{
	String name;
	int id;
	
	Teacher()// zero
	{
		System.out.println("zero perameterized constructor...");
	}
	Teacher(String n)// string
	{
		System.out.println("String perameterized constructor...");
		System.out.println(this.name=n);
	}
	Teacher(int idno)// int
	{
		System.out.println("Int perameterized constructor...");
		System.out.println(this.id=idno);
	}
	public static void main(String[] args) {
		Teacher t1=new Teacher();
		Teacher t2=new Teacher("J. P. Sir");
		Teacher t3=new Teacher(101);	
	}
}
