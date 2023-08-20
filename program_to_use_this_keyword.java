class Box{
double height;
double width;
double depth;
void set(double height,double width,double depth){
this.depth=depth;
this.height=height;
this.width=width;
}
double vol(){
return this.depth*this.height*this.width;
}
}
public class This{
public static void main(String[] args) {
Box ob=new Box();
ob.set(10,10,10);
System.out.println("volume="+ob.vol());
}
}
