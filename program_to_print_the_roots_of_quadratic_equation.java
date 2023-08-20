import java.util.Scanner;
class Roots{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of a, b, c");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	double d = (b*b)-(4*a*c);
	double r1, r2;
		if(d>0){
		r1 = -b + (int)Math.pow(d,0.5);
		r2 = -b - (int)Math.pow(d,0.5);
		System.out.print("Root1 is:" + r1 + "\nRoot2 is:" + r2);
		System.out.println("\nDifferent and real root");
		}else if(d==0){
		r1 = -b + (int)Math.pow(d,0.5);
		r2 = -b - (int)Math.pow(d,0.5);
		System.out.print("Root1 is:" + r1 + "\nRoot2 is:" + r2);
		System.out.println("\nEqual and real root");
		}else if(d<0){
		r1 = -b + (int)Math.pow(d,0.5);
		r2 = -b - (int)Math.pow(d,0.5);
		System.out.print("Root1 is:" + r1 + "\nRoot2 is:" + r2);
		System.out.println("\nComplex and imaginary root");

		}
	}
}
