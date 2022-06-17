package com.geekbrains.lesson4.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>(); // в этот лист можно складывать только строки <String>
		
		ArrayList list2 = new ArrayList<String>(); // это сырой тип (raw type), т.е. по сути Object. Класть можно все что угодно. 
		
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Bats", "Gold", "Punch", "Tracks", "Bats", "Bats"));
		
		while (list3.remove("Bats")); // удаляет все вхождения "Bats" в лист
		
		Collections.sort(list3); // sort() сортирует только объекты классов, поддерживающих интерфейс Comparable
		
		list3.sort(new Comparator<String>() { // здесь создали анонимный внутренний класс и сразу описали его метод
			@Override
			public int compare (String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		
		list3.sort((o1, o2) -> o1.length() - o2.length()); // более короткий способ записи при помощи лямбда-выражения
		
		
		List<String> linkedList = new LinkedList<>();
		
		
	}
}
