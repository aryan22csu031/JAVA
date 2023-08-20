import java.util.Scanner;
class Frequency{
 public static void main(String[] args) {
 int[] arr = new int[5];
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter 5 integers:");
 for (int i = 0; i < arr.length; i++) {
 arr[i] = sc.nextInt();
 }
 System.out.println("Enter a number to search:");
 int num = sc.nextInt();
 int count = 0;
 for (int i = 0; i < arr.length; i++) {
 if (arr[i] == num) {
 count++;
 }
 }
 System.out.println("The number " + num + " occurs " + count + " times in the array.");
 }
}
