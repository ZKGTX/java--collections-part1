package com.geekbrains.lesson4.generics;

public class GenericBox<T> {
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public GenericBox(T obj) {
		super();  
		this.obj = obj;
	}
	
	//public void doSomething() {
		//T object = new T();  // <<< нельзя создавать обобщенные объекты внутри обобщенного класса
	//}
	
	
}
