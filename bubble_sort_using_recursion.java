import java.lang.reflect.Array;
import java.util.Arrays;

class Bub{
    static void sort(int[] arr, int row, int col){ //row represents length of the array
                                                   //col is the element that is compared during traversal
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
                sort(arr,row,col+1);
            }else{
                sort(arr,row-1,0);
            }
        }
    }
    public static void main(String args[]){
        int[] arr = {3,2,1,5,4};
        sort(arr,4,0);
        System.out.print(Arrays.toString(arr));
    }
}
