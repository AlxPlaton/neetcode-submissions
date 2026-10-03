class Solution {
    public int[] replaceElements(int[] arr) {
        int currVal = 0, max = -1;
		for (int i = arr.length - 1; i >= 0; i--) {			
			currVal = arr[i];
			arr[i] = max;			 
			max = Math.max(currVal,max);
			
		}
		
		return arr;
    }
}