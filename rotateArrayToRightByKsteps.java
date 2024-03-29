package StriverDSASheet;

public class rotateArrayToRightByKsteps {
    public void rotate(int[] nums, int k) {
        k = k % nums.length; // Ensure k is within the range of array length
        reverse(nums, 0, nums.length - 1); // Reverse the whole array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, nums.length - 1); // Reverse the remaining elements
    }

    // Helper function to reverse elements in the array within the given range
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
