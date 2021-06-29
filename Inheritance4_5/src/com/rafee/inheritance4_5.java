package com.rafee;

class Animal {
	public String furColor; 
	
	void makeNoise() {
		System.out.println("woof!");
	}
}

class Dog extends Animal {
	void makeNoise() {
		System.out.println("The dog barks");
	}
	
}

public class inheritance4_5 {
	public static void main(String[] args) {
		
		Dog features = new Dog();
		features.furColor = "red";
		//features.makeNoise();
		features.makeNoise();
		
		
		
		
	}
	
}