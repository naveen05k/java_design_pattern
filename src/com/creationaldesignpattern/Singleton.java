package com.creationaldesignpattern;


public class Singleton {
	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getinSingleton() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Lazy Singleton Instance!");
	}

	public static void main(String[] args) {
		Singleton obj = new Singleton();
		System.out.println("1" + obj);
		Singleton obj1 = new Singleton();
		System.out.println("2" + obj1);

		obj.showMessage();

	}
}
