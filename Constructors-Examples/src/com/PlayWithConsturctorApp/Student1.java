package com.PlayWithConsturctorApp;

public class Student1 
{
	String name;
	int age;
	int id;
	double perc;
	
	Student1(String nam, int sid) // First constructor.
	{
		this.name=nam;
		this.id=sid;
	}
	Student1(String nam, int sid, int sage) // Second constructor.
	{
		this.name=nam;
		this.id=sid;
		this.age=sage;
	}
	Student1(String nam, int sid, int sage, double sperc) // Third constructor.
	{
		this.name=nam;
		this.id=sid;
		this.age=sage;
		this.perc=sperc;
	}
	
	public static void main(String[] args) 
	{
		Student1 s1=new Student1("Radhika", 101);
		Student1 s2=new Student1("Rupali", 102, 22);
		Student1 s3=new Student1("Rani Lodhi", 103, 21, 80.45);
		
		System.out.println(s1.name+" "+s1.id+" "+s1.age+ " "+ s1.perc);
		
		System.out.println(s2.name+" "+s2.id+" "+s2.age+ " "+ s2.perc);
		
		System.out.println(s3.name+" "+s3.id+" "+s3.age+ " "+ s3.perc);
	}

}







