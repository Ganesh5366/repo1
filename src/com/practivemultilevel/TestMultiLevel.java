package com.practivemultilevel;

class Car {
	public void driver() {
		System.out.println("For Driver Saftey Belt Is Important ");
	}
}
class Volvo extends Car {
	public void safetyBelt()  {
		System.out.println("The volvo Company findout The SafetyBelt First");
	}
}
class AllCars extends Volvo{
	public void acceptTheTechnology() {
		System.out.println("All Car Companies Are Accepts The Volvo Technology");
	}
}
public class TestMultiLevel {

	public static void main(String[] args) {
		AllCars belt=new AllCars(); 
		belt.acceptTheTechnology();
		belt.safetyBelt();

	}

}
