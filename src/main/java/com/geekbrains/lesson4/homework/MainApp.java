package com.geekbrains.lesson4.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MainApp {
	
	public static void main(String[] args) {
		List<Fruit> apples = new ArrayList<>();
		List<Fruit> oranges = new ArrayList<>();
		List<Fruit> fruits = new ArrayList<>();
		
		Box appleBox = new Box (apples);
		Box orangeBox = new Box (oranges);
		Box emptyBox = new Box (fruits);
		
		for (int i = 0; i < 100; i++) {
			appleBox.addFruit(new Apple());
		}
		
		for (int i = 0; i < 100; i++) {
			orangeBox.addFruit(new Orange());
		}
		
		System.out.println(appleBox.getWeight());
		System.out.println(orangeBox.getWeight());
		System.out.println(appleBox.compare(orangeBox));
		
		transferFruit (appleBox, emptyBox);
		
		System.out.println(appleBox.getWeight());
		System.out.println(emptyBox.getWeight());

		
		
		
		
	}
	
	public static void swap (Object[] array, int i, int j) {
				
		Object temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
		
	}
	
	public static <T> ArrayList<T> toArrayList(T[] array) {
		ArrayList<T> list = new ArrayList<T>(array.length);
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);
		}
		return list;
	} 
	
	
	public static void transferFruit (Box currentBox, Box anotherBox) {
		if (currentBox == anotherBox) {
			return;
		} 
		anotherBox.getFruits().addAll(currentBox.getFruits());
		currentBox.getFruits().clear();
	}
	
}
