import java.util.Scanner;
class Armstrong{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int n = sc.nextInt();
	int d = 0;
	int sum = 0;
	int num = n;
	while(n>0){
		d=n%10;
		sum = sum+(d*d*d);
		n = n/10;
	}
	if(sum == num){
	System.out.println("It is armstrong");}
	else
	{
	System.out.println("It is not armstrong");
	}
	}
}
