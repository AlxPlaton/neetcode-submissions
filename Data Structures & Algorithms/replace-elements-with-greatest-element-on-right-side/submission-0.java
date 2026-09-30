class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1; // End value needs to be -1
		int read; // Uninitallized because it changes with the loop always
		
		for (int i = arr.length - 1; i >= 0; i--) {
			read = arr[i];
			arr[i] = max;
			max = Math.max(read, max);
		}
		
		return arr;
    }
}