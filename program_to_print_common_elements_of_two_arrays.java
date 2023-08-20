import java.util.Arrays;
import java.util.Scanner;
public class Commonelements {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the size of the first array: ");
 int size1 = sc.nextInt();
 int[] array1 = new int[size1];
 for (int i = 0; i < size1; i++) {
 System.out.print("Enter element " + (i+1) + ": ");
 array1[i] = sc.nextInt();
 }
 System.out.print("Enter the size of the second array: ");
 int size2 = sc.nextInt();
 int[] array2 = new int[size2];
 for (int i = 0; i < size2; i++) {
 System.out.print("Enter element " + (i+1) + ": ");
 array2[i] = sc.nextInt();
 }
 System.out.println("Array 1: " + Arrays.toString(array1));
 System.out.println("Array 2: " + Arrays.toString(array2));
 System.out.println("Common elements:");
 for (int i = 0; i < size1; i++) {
 for (int j = 0; j < size2; j++) {
 if (array1[i] == array2[j]) {
 System.out.println(array1[i]);
 break;
 }
 }
 }
 }
}

