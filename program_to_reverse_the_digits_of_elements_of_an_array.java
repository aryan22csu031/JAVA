import java.util.*;

class reverseArr{
    static int[] revElements(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int reversed = 0;

            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            arr[i] = reversed;
        }
        return arr;
    }
    public static void main(String args[]){
        int[] arr1 = {34,87,56};
        System.out.print(Arrays.toString(revElements(arr1)));


    }
}
