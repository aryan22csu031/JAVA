import java.util.Scanner;
public class Productmat{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row,coloumn,coloumn1;
		System.out.print("Enter the number of rows of first matrix:");
		row=sc.nextInt();
		System.out.print("Enter the numbers of coloumn of first matrix:");
		coloumn=sc.nextInt();
		System.out.print("Enter the numbers of coloumn of second matrix:");
		coloumn1=sc.nextInt();
		int[][] arr1=new int[row][coloumn];
		int[][] arr2=new int[coloumn][coloumn1];
		int[][] arr3=new int[row][coloumn1];
		System.out.print("Enter elements of first matrix:");
		for(int i=0;i<row;i++){
			for(int s=0;s<coloumn;s++){
				arr1[i][s]=sc.nextInt();
			}
		}
		System.out.print("Enter elements of second matrix:");
		for(int i=0;i<coloumn;i++){
			for(int s=0;s<coloumn1;s++){
				arr2[i][s]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++){
        for(int s=0;s<coloumn1;s++){
        int sum=0;
        for(int x=0;x<coloumn;x++){
            sum=sum+(arr1[i][x]*arr2[x][s]);
        }
        arr3[i][s]=sum;
        }}
        for(int i=0;i<row;i++){
        	for(int s=0;s<coloumn1;s++){
            System.out.print(arr3[i][s]+"\t");
        	}
        	System.out.print("\n");
   }
}
}
