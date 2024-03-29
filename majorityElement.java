package StriverDSASheet;
import java.util.*;

public class majorityElement {
    public static int findMajority(int[] arr){
        int count=1;
        int ans=arr[0];
        for(int i=0;i<arr.length-1;i++) {
            int j = i + 1;
            if (arr[i] == arr[j]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {3,3,1,1,1,3,3};
        System.out.println(findMajority(a));
    }
}
