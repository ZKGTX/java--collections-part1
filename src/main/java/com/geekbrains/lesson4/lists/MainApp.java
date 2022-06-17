package com.geekbrains.lesson4.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<String>(); // � ���� ���� ����� ���������� ������ ������ <String>
		
		ArrayList list2 = new ArrayList<String>(); // ��� ����� ��� (raw type), �.�. �� ���� Object. ������ ����� ��� ��� ������. 
		
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Bats", "Gold", "Punch", "Tracks", "Bats", "Bats"));
		
		while (list3.remove("Bats")); // ������� ��� ��������� "Bats" � ����
		
		Collections.sort(list3); // sort() ��������� ������ ������� �������, �������������� ��������� Comparable
		
		list3.sort(new Comparator<String>() { // ����� ������� ��������� ���������� ����� � ����� ������� ��� �����
			@Override
			public int compare (String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		
		list3.sort((o1, o2) -> o1.length() - o2.length()); // ����� �������� ������ ������ ��� ������ ������-���������
		
		
		List<String> linkedList = new LinkedList<>();
		
		
	}
}
