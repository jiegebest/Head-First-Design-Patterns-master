package designpatterns.behavior11.strategy.test;

import java.util.ArrayList;

public class AnimalTest {
	public abstract class Animal {
		abstract void makeSound();
	}

	public class Dog extends Animal {
		void makeSound() {
			bark();
		}
		void bark() {
			System.out.println("Woof");
		}
	}

	public class Cat extends Animal {
		void makeSound() {
			meow();
		}
		void meow() {
			System.out.println("Meow");
		}
	}

	public void makeSomeAnimals() {
		Animal dog = new Dog();
		Animal cat = new Cat();
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(dog);
		animals.add(cat);
		animals.forEach(Animal::makeSound);
	}
 
	public static void main(String[] args) {
		AnimalTest at = new AnimalTest();
		at.makeSomeAnimals();
	}
}
