import java.util.Scanner;
class Car{
	String name;
	String type;
	Scanner sc = new Scanner(System.in);
	void set(){
		System.out.println("Enter the name of car: ");
		name = sc.nextLine();
		System.out.println("Enter the type of car: ");
		type = sc.nextLine();
	}
}
class Vehicle extends Car{
	int cost;
	int quantity;
	int total;
	void setup(){
		System.out.print("Enter the cost of the car in dollar: $");
		cost = sc.nextInt();
		System.out.println("Enter the quantity of the car: ");
		quantity = sc.nextInt();
		total = cost*quantity;
	}
	void print(){
		System.out.println("Name: "+name);
		System.out.println("Type: "+type);
		System.out.println("Cost: "+cost);
		System.out.println("Quantity: "+quantity);
		System.out.println("Total amount in dollar: $"+total);
	}
}
public class SingleInheritance{
	public static void main(String[] args){
		Vehicle ob = new Vehicle();
		ob.set();
		ob.setup();
		ob.print();
	}
}
