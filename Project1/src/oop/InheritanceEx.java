package oop;
class Animal{
	void eat() {
		System.out.println("Animal eats");
	}
}
/*class Cat extends Animal{          //only single extension SINGLE INHERITANCE
	void meow() {
		System.out.println("Cats meow");		
	}
}
*/
class Dog extends Animal{  //when more than one extension Hierarchical inheritance
	void bark() {
		System.out.println("Dogs bark");
	}
}

class BabyDog extends Dog{          //Multilevel inheritance
	void weep() {
		System.out.println("Babydog weeps");
	}
}

public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Cat c = new Cat();
		c.eat();
		c.meow();*/
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		BabyDog bd= new BabyDog();
		bd.eat();
		bd.bark();
		bd.weep();

	}

}
