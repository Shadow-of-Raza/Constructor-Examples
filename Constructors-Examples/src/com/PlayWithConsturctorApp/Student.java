package com.PlayWithConsturctorApp;
public class Student
{
	String name;
	int rno;
	
	Student(String n, int r)
	{
		this.name= n;
		this.rno=r;
		
	}
	public static void main(String[] args) 
	{
		
		Student s1=new Student("Dinga", 102);
		
		System.out.println(s1.name + " " + s1.rno);
		
		Student s2=new Student("Dingi", 103);
		
		System.out.println(s2.name + " " + s2.rno);
		
		Student s3=new Student("Bhola", 104);
		
		System.out.println(s3.name + " " + s3.rno);
		
	}
	
}
