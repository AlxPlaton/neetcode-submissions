class Solution {
    public int removeElement(int[] nums, int val) {
        
        int right = 0; // Explorer , Reader
        int left = 0; // Writer, Baseline
        while (right < nums.length) {           
            if (nums[right] != val) {
            	nums[left] = nums[right];
            	left++; 
            }
            right++;
        }
        
        return left;

    }
}