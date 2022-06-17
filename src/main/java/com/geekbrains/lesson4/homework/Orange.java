package com.geekbrains.lesson4.homework;

public class Orange extends Fruit {
	
	private float weight;
	
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public Orange() {
		super();
		this.weight =  1.5f;
	}
	
}
