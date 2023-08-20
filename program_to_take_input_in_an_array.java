import java.util.Scanner;
public class InputArray{
	public static void main(String[] args) {
		System.out.print("Enter the number of elements:");
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter all the values:");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			System.out.print(arr[i]+"\t");
		}

	}
}
