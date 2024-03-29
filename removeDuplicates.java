package StriverDSASheet;
//return total number of elements in the array, except the duplicates
public class removeDuplicates {
    public static int remDuplicates(int[] arr){
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i] != arr[i+1]){
                j++;
                arr[j] = arr[i+1];
            }
            i++;
        }
        j++;
        return j;
    }
}
