package com.solid.principles;

public class SolidPrinciples {
	
	/**
	 * The following five concepts make up our SOLID principles:
			Single Responsibility
			Open/Closed
			Liskov Substitution
			Interface Segregation
			Dependency Inversion
	 */
}

//**************************************Single Responsibility*************************************************

class AccountDetails {
	private String name;
	private long accountNumber;
	private String ifscCode;
}

class Transactions {
	private long senderAccountAddress;
	private long receiverAccountAddress;
}

//Above two class should not be mixed. Every class should be singly responsible for one activity.

//**************************************Open Close Principles************************************************


class Guitar {

    private String make;
    private String model;
    private int volume;

    //Constructors, getters & setters
}

class SuperCoolGuitarWithFlames extends Guitar {

    private String flameColor;

    //constructor, getters + setters
}

//If we want to add new feature then make a new class and extend a existing class so that existing class wont get affected.


//********************************************** Liskov Substitution *************************************************

//The Super Class should be completely substituted or replaced by Sub Class without disrupting the behaviour of our class.

interface Vehicle {
	public void engine();
}

class Car implements Vehicle {

	@Override
	public void engine() {		
	}
}

class Bicycle implements Vehicle {

	@Override
	public void engine() {
		throw new RuntimeException(); //EngineNotFoundException();
	} 
}
//Here bicycle doesn't have engine so super class Vehicle is not subsituted by sub class.
//Here two different interfaces VehicleWithEngine and VehicleWithoutEngine should be made to cater this change.

//********************************************** Inteface Segregation *************************************************


interface Animal {
	public void groom();
	public void feed();
}

class Dog implements Animal{
	public void groom(){
	}
	public void feed() {
	}
}

//Here groom method is not applicable for Tiger as we can only groom the pet animals.
class Tiger implements Animal {
	@Override
	public void groom() {
	}
	@Override
	public void feed() {
	}
}

//So above example should get breakdown into :

interface AnimalI {
	public void feed();
}

interface Pet extends  AnimalI {
	public void groom();
}

//Now Dog implements Pet
//Tiger implements Animal

//********************************************** Dependency Inversion *************************************************

//https://www.youtube.com/watch?v=gumM1H4qLUM&ab_channel=TheCodeMate  - Watch from 15:40

class Monitor{}
class QueryKeyboard{}

class Desktop {
	private Monitor monitor;
	private QueryKeyboard keyboard;

//	Desktop(){
//		this.monitor = new Monitor();
//		this.keyboard = new Keyboard();
//	}
	
	Desktop(QueryKeyboard keyboard, Monitor monitor){ //Here we can pass Desktop(Keyboard keyboard, Monitor monitor){
		this.monitor = monitor;
		this.keyboard = keyboard;
	}
}

//Above example is tightly coupled as whenever a instance of Desktop is created, laptop of monitor and keyboard 
//will automatically created as default constructor is called automatically.

//Instead we should use parametrised constructor to get the object and pass to it.

//Now Keyboard can be GamingKeyboard as well. So what we can do is : 

interface Keyboard{}

class GamingKeyboard implements Keyboard{}
class QueryKeyboard1 implements Keyboard{}

//Now we can use Keyboard in above example instead of QueryKeyboard


















