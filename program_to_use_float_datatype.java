import java.util.Scanner;
class DemoFloat{
	public static void main(String[] args){
	double rad,area,pi;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of circle:");
    rad=sc.nextDouble();
    pi = 3.1416;
    area = pi*rad*rad;
    System.out.print("Area of circle is:"+ area);
	}
}
