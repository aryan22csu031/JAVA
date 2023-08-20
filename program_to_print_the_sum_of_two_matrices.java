import java.util.Scanner;
class Sum{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("No.of rows of array");
	int a =sc.nextInt();
	System.out.println("No.of coloums of array");
	int b =sc.nextInt();
	int[][] arr = new int[a][b];
	System.out.println("Enter elements of first arrays");
	for(int i=0;i<a;i++){
		for(int j=0;j<b;j++){
		arr[i][j] =sc.nextInt();
		}
	}
		int[][] arr1 = new int[a][b];
	System.out.println("Enter elements of second arrays");
	for(int i=0;i<a;i++){
		for(int j=0;j<b;j++){
		arr1[i][j] =sc.nextInt();	
		}
	}
	System.out.println("Sum of two matrices");
	for(int i=0;i<a;i++){
		for(int j=0;j<b;j++){
		System.out.print(" "+(arr1[i][j]+arr[i][j]));
		}
	System.out.println();
			}
	
		}
	}
