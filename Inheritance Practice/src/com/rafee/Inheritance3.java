package com.rafee;


class A {
	void car() {
		String brand = "Lexus";
		int year = 1998;
		
		System.out.println(brand);
		System.out.println(year);
	}
}

class B extends A {
	void rand() {
		long plate = 324234L;
		System.out.println(plate);
	}
}

public class Inheritance3 {
	public static void main(String[] args){ 
		
		B newB = new B();
		A newA = new A();
		
		newB.car();
		newB.rand();
		
		System.out.println("Car is registered");
	}
	
	
}
