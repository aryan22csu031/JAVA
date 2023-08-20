import java.util.Scanner;
class Box{
	double width;
	double height;
	double depth;

	double volume(){
	return width*height*depth;}
}
	class Boxdemo{
		public static void main(String[] args){
			Box mybox1 = new Box();
			Box mybox2 = new Box();
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the dimensions of box1");
			mybox1.width = sc.nextDouble();
			mybox1.height = sc.nextDouble();
			mybox1.depth = sc.nextDouble();
			System.out.println("Enter the dimensions of box2");
			mybox2.width = sc.nextDouble();
			mybox2.height = sc.nextDouble();
			mybox2.depth = sc.nextDouble();
			System.out.println("Volume of Box1 is:"+mybox1.volume());
			System.out.println("Volume of Box2 is:"+mybox2.volume());
		}
	}
