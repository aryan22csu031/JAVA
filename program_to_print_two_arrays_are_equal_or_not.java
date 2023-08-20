import java.util.Scanner;
class Compare{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter elements of a string");
	String x = sc.next();
	System.out.println("Enter elements of a string");
	String y = sc.next();
	if(x.equals(y))
	{
	System.out.println("Strings are Equal");
	}
	else
	{
	System.out.println("Strings are not Equal");
	}
	}
}
