import java.util.Scanner;
class EvenoddArrayLength{
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the number of elements in the array: ");
 int n = sc.nextInt();
 int[] arr = new int[n];
 System.out.println("Enter the elements of the array: ");
 for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
 }
 int[] evenArray = new int[n];
 int[] oddArray = new int[n];
 int evenCount = 0;
 int oddCount = 0;
 for (int i = 0; i < n; i++) {
 if (arr[i] % 2 == 0) {
 evenArray[evenCount++] = arr[i];
 } else {
 oddArray[oddCount++] = arr[i];
 }
 }
 System.out.print("Original Array: ");
 printArray(arr, n);
 System.out.println("Length: " + n);
 System.out.print("Even Array: ");
 printArray(evenArray, evenCount);
 System.out.println("Length: " + evenCount);
 System.out.print("Odd Array: ");
 printArray(oddArray, oddCount);
 System.out.println("Length: " + oddCount);
 }
 public static void printArray(int[] arr, int length) {
 for (int i = 0; i < length; i++) {
 System.out.print(arr[i] + " ");
 }
 System.out.println();
 }
}
