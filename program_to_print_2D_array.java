import java.util.Scanner;
class Multidimensional{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("No.of rows");
	int a =sc.nextInt();
	System.out.println("No.of coloums");
	int b =sc.nextInt();
	int[][] arr = new int[a][b];
	System.out.println("Enter elements of arrays");
	for(int i=0;i<a;i++){
		for(int j=0;j<b;j++){
		arr[i][j] =sc.nextInt();	
		}
	}
	System.out.println("elements of arrays:");
	for(int i=0;i<a;i++){
		for(int j=0;j<b;j++){
		System.out.print(" "+arr[i][j]);
		}
	System.out.println();
	}
	
	}
}
