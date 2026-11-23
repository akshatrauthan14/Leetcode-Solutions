class Solution {
    public int[] nextGreaterElements(int[] nums) {
        //brute force: check arr for every element O(n2)
        //use stack for optimal
        int n = nums.length;
        int[] ans = new int[n];
        //keep track of possible greater elemtns
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) { //we traverse the arr twice as its circular
            //we can travel circular arr twice without going out of range so index%n
            int idx = i % n;
            while (!stack.isEmpty() && stack.peek() <= nums[idx]) {
                //remove elements smaller or equal to top element(curr element)
                stack.pop();
            }
            //store ans only in the 1st pass not the 2nd
            if (i < n) {
                ans[idx] = stack.isEmpty() ? -1 : stack.peek();
            }
            //curr element could be greater so add it to stack
            stack.push(nums[idx]);
        }

        return ans;
    }
}
