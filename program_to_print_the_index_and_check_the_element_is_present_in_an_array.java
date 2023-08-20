import java.util.*; 
class index
{
public static void main(String arg[])
{
int array[]=new int[10]; 
int num,i;
Scanner sc=new Scanner(System.in);
 System.out.println("Enter any number :-"); 
 for(i=0;i<=9;i++)
{
array[i]=sc.nextInt();
}
System.out.println("Elements of the array :-");
 for(i=0;i<=9;i++)
{
System.out.println(""+array[i]);
}
System.out.println("Enter a number you want to search :-"); 
num=sc.nextInt();
for(i=0;i<=9;i++)
{
if(num==array[i])
{
System.out.println("This element is present in the array");
 System.out.println("This number is stored at index number "+i); 
 break;
}
}
if(i==10)
{
System.out.println("This element is not present in the array");
System.out.println("-1");
}
}
}
