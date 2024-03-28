package com.practiceHierarchical;

class HumanBody{
	public void kidney() {
		System.out.println("HumanBody Has A Kidney Inside Stomach");
	
		
	}
}
class Man extends HumanBody{
	public void men() {
		System.out.println("Men Should Drink 3.5literes Per Day To Maimntain Good Kidney Health");
	}
}
class Women extends HumanBody{
	public void women() {
		System.out.println("Women Should Drink 3liters Per Day To Maintain Good Kidney Health");
	}
}

public class TestHierarchical {

	public static void main(String[] args) {
		Man obj1=new Man();
		obj1.men();
		obj1.kidney();
		
		System.out.println("====================");
		
		Women obj2 =new Women();
		obj2.women();
		obj2.kidney();
		

	}

}
