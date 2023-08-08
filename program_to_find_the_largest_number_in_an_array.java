import java.util.*;
class large{
    static int largestNum(int[] arr){
        System.out.println("the array looks like this");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println();
        System.out.println("the largest element in the array is");
        return max;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of array");
        int SizeOfArray = in.nextInt();
        int[] arr1 = new int[SizeOfArray];
        System.out.println("enter the elements of array");
        for(int i=0; i<arr1.length; i++){
            arr1[i] = in.nextInt();

        }
        System.out.println(" ");
        System.out.println(largestNum(arr1));

    }
}
