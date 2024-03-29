package StriverDSASheet;

public class findMissingNum {
    public static int findMN(int[] nums){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<nums.length;i++){
            sum1 += nums[i];
        }
        for(int i=0; i<nums.length; i++){
            sum2 += i;
        }
        return sum2-sum1;
    }
}
