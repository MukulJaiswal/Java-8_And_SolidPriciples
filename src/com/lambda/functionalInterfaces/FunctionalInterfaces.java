package com.lambda.functionalInterfaces;


/**
 * 
 *
 */
@FunctionalInterface
interface Hello{
	abstract void display();
//	abstract void display1();//If we use @FunctionalInterface annotation, then this will give error
	
	default void display2() {
		System.out.println("Default");
	}
}

//Runnable, ActionListener, Comparable are functional Interfaces
public class FunctionalInterfaces {
	//Functional interfaces are the interfaces which have exactly one abstract method.
	/**
	 * New functional interfaces in Java
	 * Consumer
	 * Predicate 
	 * Function
	 */
}
