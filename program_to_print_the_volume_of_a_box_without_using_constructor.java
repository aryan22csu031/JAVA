import java.util.Scanner;
class Box{
	double width;
	double height;
	double depth;
}
	class Boxdemo1{
		public static void main(String[] args){
			Box mybox = new Box();
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the dimensions of box");
			mybox.width = sc.nextDouble();
			mybox.height = sc.nextDouble();
			mybox.depth = sc.nextDouble();
			double vol = mybox.width*mybox.height*mybox.depth;
			System.out.println("Volume of Box is:"+vol);
		}
	}
