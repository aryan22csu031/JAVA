package StriverDSASheet;

public class checkSortedAndRotatedArray {
    public static boolean chk(int[] nums){
        int c = 0;
        for(int i = 0;i < nums.length; i++){
            if(nums[i] > nums[(i+1)%nums.length]){ //checking every element of array, if it is greater than its next adjacent element
                //increment c showing that the element is shifted
                c++;
            }
            if(c > 1){
                return false;
            }
        }
        return true;
    }
}
