package com.mycompany;

interface XYinterface{
	
	static void m1() {
		System.out.println(" XY Interface ");
	}
	
	default void m2()
	{
		System.out.println("default m2 method o1 ");
	}
	public void m3();
}

public class Interfaces implements XYinterface{
	
	static void m1()	{		System.out.println("ddd");	}
	/*public void m2()
	{
		System.out.println("default m2 method o2 ");
	}*/
	
	public static void main(String[] args) {
		
		XYinterface xy = new Interfaces();
		
		xy.m2();
		m1(); // note: if comment m1 method in Interfaces class then you get compile time error
		// static method may be invoked on containing interface only.
		
	}

	@Override
	public void m3() {
		System.out.println(" m3 ");
		
	}

}
