import java.util.Scanner;
class Fib{
	public static void main(String[] args){
	System.out.println("Enter the number of rows");
	Scanner sc = new Scanner(System.in);
	int a=0,b=1,c;
	int s = sc.nextInt();
	System.out.println("Fibonacci:" + a);
	System.out.println("Fibonacci:" + b);
	for(int i=2;i<=s-1;i++){
	c=a+b;
	System.out.println("Fibonacci:" + c);
	a=b;
	b=c;7
	}
	}
}
