package com.geekbrains.lesson4.generics;

public class BoxWithNumbers<N extends Number> {//N получает доступ ко всем методам класса Number 
	private N[] array;

	public BoxWithNumbers(N... array) { // N... - аргумент переменной длины, любое кол-во аргументов одного типа
		super();
		this.array = array;
	}
	
	public double average() {
		double avg = 0.0;
		for (int i = 0; i < array.length; i++) {
			avg += array[i].doubleValue();
		}
		return avg / array.length;
	}
	
	public boolean compareAverage (BoxWithNumbers<?> another) {
		return Math.abs(this.average() - another.average()) < 0.0001;
	}
}


