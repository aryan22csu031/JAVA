import java.util.Arrays;

class swapFL {
    static void swapFirstLast(int[] arr){
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5};
        swapFirstLast(arr1);
        System.out.print(Arrays.toString(arr1));
    }
}
