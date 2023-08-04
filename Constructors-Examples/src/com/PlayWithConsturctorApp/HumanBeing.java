package com.PlayWithConsturctorApp;
// Parameterized Constructor...
public class HumanBeing 
{
	String name; // dicleration // constructor // object creation // this //  ?   
	int age;
	
	HumanBeing(String s, int a)
	{
		this.name =s;
		this.age=a;
	}
	
	public static void main(String[] args) {
		
		HumanBeing hb = new HumanBeing("Dinga", 12);
		System.out.println(hb.name  +  " " + hb.age);
	}
}

/** 
 * Emplyee
 * name
 * salary -- double / float
 * id
 * 
 * non-para
 * para
 * 
 * e1
 * e2
 */
