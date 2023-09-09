package StringsInJava;

import java.sql.SQLOutput;
import java.util.Arrays;

class str{
    public static void main(String[] args) {
        String s = "Apple";
        String e = "ppleA";
        System.out.print(areAnagrams(s,e));
    }
    static boolean areAnagrams(String s, String e){
        s = s.toLowerCase();
        e = e.toLowerCase();
        char[] arr1 = s.toCharArray();
        char[] arr2 = e.toCharArray();
        /*
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }

         */
        for(int i=0; i<arr1.length-1; i++){
            for(int j=i+1; j<arr1.length; j++){
                if(arr1[i]>arr1[j]){
                    char temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        return true;
    }
}
