class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
		int total = 0;
		
		for (int i = 0; i < operations.length; i++) {
			
			if (operations[i].equals("+")) {
				int top = stack.pop();
				int sum = stack.peek() + top;
				stack.push(top);
				stack.push(sum);
			}
			else if (operations[i].equals("C")) {
				stack.pop();
			}
			else if (operations[i].equals("D")) {				
				stack.push(2 * stack.peek());
			}
			else {
				stack.push(Integer.parseInt(operations[i]));
			}
			
		}
		
		 while (!stack.isEmpty()) {
	            total += stack.pop();
	        }
		return total;
} }