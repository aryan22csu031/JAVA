package StriverDSASheet;

import java.util.HashMap;

import static java.lang.Math.max;

//find max subarray having sum K
public class maxSubArrayWithSumK {
    public static int findSubArrayOnlyPositives(int[] arr, int k){
        int left=0, right=0;
        long sum= arr[0];
        int len = 0;
        while(right<arr.length){
            while(left<=right && sum>k){
                sum -= arr[left];
                left++;
            }
            if(sum==k){
                len = Math.max(len,right-left+1);
            }
            right++;
            if(right<arr.length){
                sum += arr[right];
            }
        }
        return len;
    }
    public static int getLongestSubarrayIncludingNegatives(int []a, long k) {
        int n = a.length;

        HashMap<Long, Integer> MapAns = new HashMap<>();
        long sum = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];

            if (sum == k) {
                ans = Math.max(ans, i + 1);
            }

            long rem = sum - k;

            if (MapAns.containsKey(rem)) {
                int len = i - MapAns.get(rem);
                ans = Math.max(ans, len);
            }

            if (!MapAns.containsKey(sum)) {
                MapAns.put(sum, i);
            }
        }
        System.out.println(MapAns);

        return ans;
    }


    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,1,1};
    //    System.out.print(findSubArrayOnlyPositives(a,3));
        System.out.println(getLongestSubarrayIncludingNegatives(a,3));
    }
}
