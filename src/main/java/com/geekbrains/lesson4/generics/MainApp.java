package com.geekbrains.lesson4.generics;

import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		
		GenericBox<String> stringBox = new GenericBox<String>("Java");
		GenericBox<Integer> intBox1 = new GenericBox<Integer>(20);
		GenericBox<Integer> intBox2 = new GenericBox<Integer>(10);
		intBox1.setObj(11);
		
		int sum = intBox1.getObj() + intBox2.getObj();
		
		BoxWithNumbers<Integer> intBox = new BoxWithNumbers<Integer>(1,2,3,4);
		BoxWithNumbers<Float> floatBox = new BoxWithNumbers<Float>(1.0f, 2.0f, 3.0f, 4.0f);
		System.out.println(intBox.compareAverage(floatBox));
		
		
		GenericBox <Number> gbn = new GenericBox<Number>(1);
		GenericBox <Integer> gbi = new GenericBox<Integer>(1);
		doSomething1(gbn);
		doSomething2(gbn);
		doSomething1(gbi);
		//doSomething2(gbi); // �� ���������, ����� �������� � ����� ������ ��� Number
	}
	
	public static void doSomething1 (GenericBox <? extends Number> box) {// ����� �������� � ����� ��� Number ��� ������ ��� ����������
		
	}
	
	public static void doSomething2 (GenericBox <Number> box) { // ����� �������� � ����� ������ ��� Number
		
	}
	
	public static void doSomething3 (GenericBox <? super Number> box) {// ����� �������� � ����� ��� Number ��� ��� �������� 
		
	}
	
	public static <T> T getFirstElement (List<T> list) { // ���������� �����, Java �������� ���������� ��� T � ����������� �� ����������� ���������.
		return list.get(0);
	} 
	 

}
