class Box{
	double width;
	double height;
	double depth;

	double volume(){
	return width*height*depth;}
}
	void setDim(double w,double h,double d){
		width = w;
		height = h;
		depth = d;
	}
	class Boxdemo2{
		public static void main(String[] args){
			Box mybox1 = new Box();
			Box mybox2 = new Box();
			double vol;
			mybox1.setDim(10,15,20);
			mybox2.setDim(3,2,9);
			System.out.println("Volume of box1 is :"+mybox1.volume);
			System.out.println("Volume of box2 is :"+mybox2.volume);
		}
	}
