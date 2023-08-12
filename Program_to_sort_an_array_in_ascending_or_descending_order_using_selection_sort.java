import java.util.*;

class SelectionSort {
    static void selectsortDsc(int[] arr){ //sort array in Descending order
        for(int i=0; i<arr.length; i++) {
            int FirstElementIndex = i; //index of First Element after each step
            int MaxIndex = MaxIndex(arr,i,arr.length-1); // index of maximum value, in the remaining unsorted array
            swapp(arr,MaxIndex,FirstElementIndex);
        }
        System.out.print(Arrays.toString(arr));
    }
    static void selectsortAsc(int[] arr){ //sort array in Ascending order
        for(int i=0; i<arr.length; i++){
            int LastElementIndex = arr.length-i-1; //index of last Element after each step
            int MaxIndex = MaxIndex(arr,0,LastElementIndex); // index of maximum value, in the remaining unsorted array
            swapp(arr,MaxIndex,LastElementIndex);
        }
        System.out.print(Arrays.toString(arr));
    }
    static int MaxIndex(int[] arr,int start,int end){
        int MaxInd = start;
        for(int i=start; i<=end; i++){
            if(arr[MaxInd] < arr[i]){
                MaxInd = i;
            }
        }
        return MaxInd;
    }
    static void swapp(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String args[]){
        int[] arr1 = {5,9,6,3,1};
        System.out.println("Ascending order");
        selectsortAsc(arr1);
        System.out.println();
        System.out.println("Descending order");
        selectsortDsc(arr1);
    }
}
