import java.util.Arrays;

class SecondHighest{
    public static int findSecondLargest(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[arr.length-2];
    }
    public static void main(String[] args){
        int[] arr1 = {22,65,78,21,98};
        System.out.print("the second largest number in the array is "+ findSecondLargest(arr1));
    }
}
