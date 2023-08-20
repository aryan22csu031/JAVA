class Box{
	int width;
	int height;
	int depth;
	Box(){
		height=10;
		width=10;
		depth=10;
	}
	Box(int h,int w,int d){
		height=h;
		width=w;
		depth=d;
	}
	long vol(){
		return height*width*depth;
	}
}
	public class ConstructorOverloading{
		public static void main(String[] args) {
			Box ob=new Box();
			System.out.println("The volume of box is "+ob.vol());
			Box ob1=new Box(2,4,3);
			System.out.println("The volume of box is "+ob1.vol());
}
}
