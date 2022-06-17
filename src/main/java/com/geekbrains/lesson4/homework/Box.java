package com.geekbrains.lesson4.homework;

import java.util.ArrayList;
import java.util.List;

public class Box {
	
	
	private List<Fruit> fruits = new ArrayList<>();

	public List<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}

	public Box(List<Fruit> fruits) {
		super();
		this.fruits = fruits;
	}
	
	public void addFruit(Fruit fruit) {
		fruits.add(fruit);
	}
	
	public float getWeight() {
		float weight = 0;
		for (Fruit f: fruits) {
			weight += f.getWeight();
		}
		return weight;
	}
	
	public boolean compare(Box anotherBox) {
		if (this.getWeight() - anotherBox.getWeight() == 0) {
			return true;
		}
		return false;
	}
	
	
 
	

}
