import java.util.*;
class linsrch{
    static int srchArr(int[] arr, int i){
        if(arr.length == 0){
            return -1;
        }
        for(int p=0; p<arr.length; p++){
            int element = arr[p];
            if(element==i){
                System.out.println("the element is present in the array at index " +p);
                return p;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int[] arr1= {-33,-56,-79,3,-1};
        int[][] arr2 = {{1,2},{3,4},{5,6}};
        System.out.print(srchArr(arr1,33));
        System.out.print(srchArr(arr1,-33));
    }
}
