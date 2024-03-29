package StriverDSASheet;

public class moveZeroestoTheEnd {
    public static void mvZeroes(int[] nums){
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i] !=0){
                nums[j] = nums[i];
                i++;
                j++;
            }else{
                i++;
            }
        }
        for(int k=j;k<nums.length;k++){
            nums[k] = 0;
        }
    }
}
