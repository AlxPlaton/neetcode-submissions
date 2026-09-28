class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
		int checker = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1 && checker == count) {
				count++;
				checker++;
			} else if (nums[i] == 1 && checker < count) {
				checker++;
			}
			else {
				checker = 0;
			}
		}
		
		return count;
    }
}