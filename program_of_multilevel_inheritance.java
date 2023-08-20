import java.util.Scanner;
class Device{
	String type;
	Scanner sc = new Scanner(System.in);
	void set(){
		System.out.println("Which type of device you want to purchase: ");
		type = sc.nextLine();
	}
}
class Company extends Device{
	String name;
	String model;
	String colour;
	void setup(){
		System.out.println("Which company's device you want to purchase: ");
		name = sc.nextLine();
		System.out.println("Enter the model name of device: ");
		model = sc.nextLine();
		System.out.println("Which colour you want: ");
		colour = sc.nextLine();
	}
}
class Amount extends Company{
	int cost;
	int quantity;
	int total;
	void setcost(){
		System.out.println("Cost of the device in rupees: ");
		cost = sc.nextInt();
		System.out.println("Enter the quantity of device: ");
		quantity = sc.nextInt();
		total = cost*quantity;
	}
	void print(){
		System.out.println("Type: "+type);
		System.out.println("Name: "+name);
		System.out.println("Model Name : "+model);
		System.out.println("Colour : "+colour);
		System.out.println("Cost: "+cost);
		System.out.println("Quantity: "+quantity);
		System.out.println("Total amount in dollar: "+total);
	}
}
public class MultilevelInheritance{
	public static void main(String[] args){
		Amount ob = new Amount();
		ob.set();
		ob.setup();
		ob.setcost();
		ob.print();
	}
}
