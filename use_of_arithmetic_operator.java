import java.util.Scanner;
class Arithmetic{
	public static void main(String[] args){
	int num1, num2, sum, prod, div, sub, mod;
	Scanner a  = new Scanner(System.in);
	System.out.println("Enter the first number:");
	num1=a.nextInt();
	System.out.println("Enter the second number:");
	num2=a.nextInt();
	System.out.println("1.Addition");
	System.out.println("2.Subtraction");
	System.out.println("3.Multiplication");
	System.out.println("4.Division");
	System.out.println("5.Modulous");
	System.out.println("Enter the button");
	int c=a.nextInt();
	switch(c)
	{
		case 1:sum=num1+num2;
			System.out.println(sum);
		break;
		case 2:sub=num1-num2;
			System.out.println(sub);
			break;
		case 3:prod=num1*num2;
			System.out.println(prod);
			break;
		case 4:div=num2/num1;
			System.out.println(div);
			break;
		case 5:mod=num1%num2;
			System.out.println(mod);
			break;
		default:System.out.println("Invalid button");
	}
	}
}
