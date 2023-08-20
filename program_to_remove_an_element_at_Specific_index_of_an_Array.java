import java.util.Arrays;
import java.util.Scanner;

class RemoveElementAtIndex {
    public static int[] removeElementAtIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            return array;
        }

        int[] newArray = new int[array.length - 1];
        int newArrayIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            }
        }

        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("enter the index of element to be removed");
        int RemoveIndex = sc.nextInt();

        System.out.println("Original Array: " + Arrays.toString(arr));

        if (RemoveIndex >= 0 && RemoveIndex < arr.length) {
            arr = removeElementAtIndex(arr, RemoveIndex);

            System.out.println("Array after removing element at index " + RemoveIndex + ": " + Arrays.toString(arr));
        } else {
            System.out.println("Invalid index.");
        }
    }
}
