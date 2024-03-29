package StriverDSASheet;

public class sort1s2sAnd0s {
    public void sort(int[] nums) {
        int i=0, j=0, k=nums.length-1;
        while(j<=k){
            if(nums[j]==0){
                swap(nums,i,j);
                j++;
                i++;
            }else if(nums[j]==1){
                j++;
            }else {
                swap(nums,j,k);
                k--;
            }
        }
    }
    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
