import java.util.Scanner;
class Convert {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of minutes");
		double min = sc.nextDouble();
		double a = 60*24*365, b = 60*24;
		double year = min/a, days = min/b;
		System.out.println(year + " Years\n" + days + " Days");
	}
}
