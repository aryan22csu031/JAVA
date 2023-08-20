import java.util.Scanner;
class DemoInt{
	public static void main(String[] args){
	int a, b, sum;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");
	a=sc.nextInt();
	System.out.println("Enter the second number:");
	b=sc.nextInt();
	sum=a+b;
	System.out.println("The sum of two number is: "+ sum);
	}
}
