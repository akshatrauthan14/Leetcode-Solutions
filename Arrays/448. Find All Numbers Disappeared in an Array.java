class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        int expected = 1;

        for (int i = 0; i < nums.length; i++) {
            
            if (nums[i] == expected) {
                expected++;
            } 
            else if (nums[i] > expected) {
                ans.add(expected);
                expected++;
                i--;   // check the same nums[i] again
            }
        }

        // Add any numbers remaining after the array ends
        while (expected <= nums.length) {
            ans.add(expected);
            expected++;
        }

        return ans;
    }
}
