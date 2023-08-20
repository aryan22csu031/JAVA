class Animal{
	void eat(){
		System.out.println("The dog is eating");
	}
}
class Dog extends Animal{
	void bark(){
		System.out.println("The dog is barking");
	}
}
public class Single{
	public static void main(String[] args){
		Dog ob = new Dog();
		ob.eat();
		ob.bark();
	}
}
