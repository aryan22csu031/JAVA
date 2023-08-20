import java.util.Scanner;
class Temperature{
	public static void main(String[] args){
	System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	
	int b = sc.nextInt();
	String a;
	switch(b){

	case 1:
		a = "less than -5";
		System.out.println("Temperature is very low\n" + a);
		break;
	case 2:
		a = "less than 5";
		System.out.println("Temperature is low\n" + a);
		break;
	case 3:
		a = "greater than or equal to 24";
		System.out.println("Temperature is medium\n" + a);
		break;
	case 4:a = "greater than 37";
		System.out.println("Temperature is high\n" + a);
		break;
	case 5:
		a = "greater than 49";
		System.out.println("Temperature is very high\n" + a);
		break;
	default:System.out.println("Inavlid number");
	}
	}
}
