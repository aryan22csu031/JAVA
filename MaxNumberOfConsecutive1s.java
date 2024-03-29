package StriverDSASheet;

public class MaxNumberOfConsecutive1s {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int maxi = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                maxi++;
                ans = Math.max(ans,maxi);
            }else{
                maxi = 0;
            }
        }
        return ans;
    }
}
