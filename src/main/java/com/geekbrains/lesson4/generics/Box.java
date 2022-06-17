package com.geekbrains.lesson4.generics;

public class Box implements Comparable<Box> {
	private int size;

	public Box(int size) {
		this.size = size;
	}
	
	
	public int compareTo (Box o) {
		return this.size - o.size;
	}
	
	

}
