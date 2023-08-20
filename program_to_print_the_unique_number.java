import java.util.Scanner;
class Unique{
 public static void main(String[] args) {
 final int SIZE = 5;
 int[] numbers = new int[SIZE];
 int count = 0;
 Scanner sc = new Scanner(System.in); 
 for (int i = 0; i < SIZE; i++) {
 System.out.print("Enter a number between 10 and 100: ");
 int num = sc.nextInt(); 
 if (num >= 10 && num <= 100) {
 boolean duplicate = false;
 for (int j = 0; j < count; j++) {
 if (num == numbers[j]) {
 duplicate = true;
 break;
 }
 }
 if (!duplicate) {
 numbers[count++] = num;
 System.out.print("Unique numbers: ");
 for (int k = 0; k < count; k++) {
 System.out.print(numbers[k] + " ");
 }
 System.out.println();
 }
 } else {
 System.out.println("Error: Number must be between 10 and 100");
 i--;
 }
 }
 }
}
