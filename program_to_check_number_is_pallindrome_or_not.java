import java.util.Scanner;
class Palindrome{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int d = 0;
	int rev = 0;
	int num = n;
	while(n>0){
		d=n%10;
		rev = (rev*10)+d;
		n = n/10;
	}
	if(rev == num){
	System.out.println("It is palindrome");}
	else
	{
	System.out.println("It is not palindrome");
	}
	}
}
