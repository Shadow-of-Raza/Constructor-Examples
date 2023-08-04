package com.PlayWithConsturctorApp;
class Mobile // College
{
	String sname;
	
	Mobile() // Constructor 
	{
		super();
		sname="Dinga";
		sname="Dingi";
	
	}
	public static void main(String[] args) 
	{
		 Mobile m= new Mobile();	 
		 System.out.println(m.sname);
		 
		 Mobile m1= new Mobile();	 
		 System.out.println(m1.sname);
	} 
}
