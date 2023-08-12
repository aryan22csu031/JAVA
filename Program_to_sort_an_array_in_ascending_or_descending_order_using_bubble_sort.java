import java.util.*;

class bubblesort{
    static void sortDescending(int[] arr){ // sort array in Descending order
        for(int i=0; i < arr.length; i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr)); //this will print the array in the form [...]
        System.out.println();
    }
    static void sortAscending(int[] arr){ // sort array in ascending order
        for(int i=arr.length-1; i >=0; i--) {
            for (int j = arr.length - 2; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr)); //this will print the array in the form [...]
    }
    public static void main(String args[]){
        int[] arr1 = {33,78,65,34,11};
        int[] arr2 = {34,76,85,29,23};
        System.out.println("Descending order");
        sortDescending(arr1);
        System.out.println("Ascending order");
        sortAscending(arr2);
    }
}
