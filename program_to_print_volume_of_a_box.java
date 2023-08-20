class Box{
int width;
int height;
int depth;
Box(){
height=10;
width=10;
depth=10;
}
long vol(){
return height*width*depth;
}
}
public class Constructor{
public static void main(String[] args) {
Box ob=new Box();
System.out.println("The volume of box is "+ob.vol());
}
}
