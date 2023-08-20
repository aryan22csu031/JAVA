import java.util.*;
class Box{
long vol(int h,int w,int d){
return h*w*d;
}
double vol(double h,double w,double d){
return h*w*d;
}
void vol(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the height:");
int h=sc.nextInt();
System.out.println("Enter the depth:");
int d=sc.nextInt();
System.out.println("Enter the width:");
int w=sc.nextInt();
System.out.println("The volume of Box is "+h*d*w);
}
}
public class MethodOverloading{
public static void main(String[] args) {
Box ob=new Box();
System.out.println("The volume of Box is "+ob.vol(2,3,4));
System.out.println("The volume of Box is "+ob.vol(1.2,3.2,4.1));
ob.vol();
}
}
