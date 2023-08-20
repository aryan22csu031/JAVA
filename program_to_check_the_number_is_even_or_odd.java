import java.util.Scanner;
class EvenOdd{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int b = sc.nextInt();
	if(b%2==0){
	System.out.println("Number is Even");
	}else{
	System.out.println("Number is odd");
	}
	}
}
