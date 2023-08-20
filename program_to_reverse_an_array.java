import java.util.ArrayList;
import java.util.Arrays;

class reverse{
    static void reverseArray(int[] arr){ //Aryan Arora 22csu031
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }

public static void main(String[] args) {
int[] array1 = {1,2,3,4,5};
reverseArray(array1);
}
}
