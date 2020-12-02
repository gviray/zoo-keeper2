package com.zoo;

public class Gorilla extends Mammal {

	public void throwSomething() {
		System.out.println("Threw a banana peel");
		energyLevel -= 5;
		System.out.println(energyLevel);
	}
	
	public void eatBananas() {
		System.out.println("Ate a banana");
		energyLevel += 10;
		System.out.println(energyLevel);
	}
	
	public void climb() {
		System.out.println("Climbed a tree");
		energyLevel -= 10;
		System.out.println(energyLevel);
	}

}