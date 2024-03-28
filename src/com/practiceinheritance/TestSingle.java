package com.practiceinheritance;

class Animal {
	public void running() {
		System.out.println("The Animal Is running");
	}}
	 class Dog extends Animal {
		public void barking() {
			System.out.println("The Dog Is Barking");
		
		}
	 }
	 public class TestSingle {
		public static void main(String[]args) {
			Dog d= new Dog();
			d.barking();
			d.running();
		}
		
	}
	



