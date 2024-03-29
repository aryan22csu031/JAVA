package StriverDSASheet;

import java.util.Arrays;

public class Merge_two_Sorted_Arrays_Without_Using_Extra_space {
    public static void merge(long[] a1, long[] a2, int n, int m){
        int left = n-1;
        int right = 0;
        while(left>=0 && right<m){
            if(a1[left]>a2[right]){
                long temp = a1[left];
                a1[left] = a2[right];
                a2[right] = temp;
                left--;
                right++;
            }else{
                break;
            }
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
    }
    public static void main(String[] args) {
        long[] arr1 = {1, 4, 8, 10};
        long[] arr2 = {2, 3, 9};
        int n = 4, m = 3;
        merge(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
