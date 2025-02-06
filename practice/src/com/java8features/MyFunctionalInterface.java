package com.java8features;

@FunctionalInterface
public interface MyFunctionalInterface {
	public void sayHello(); // single abstract method (SAM)

	//multiple default or static methods
	default void sayBye() {

	};
	default void sayCheese() {

	};

	public static void sayOk() {

	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello functional interface");
	}

}
