import java.util.*;
public class Maxarray{
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the size of array:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter the elements of array:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0],min=arr[0];
		for(int i=1;i<n;i++){
			if(max<arr[i])
				max=arr[i];
			else if(min>arr[i])
				min=arr[i];
		}
		System.out.print("Maximum="+max+"   Minimum="+min);
	}
}
