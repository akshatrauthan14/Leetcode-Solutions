class Solution {
    public void rotate(int[] nums, int k) {
        //to handle cases where k > len
        k = k%nums.length;
        //rev entire arr
        reverse(nums,0,nums.length-1);
        //rev first k elements
        reverse(nums, 0 , k-1);
        //rev rem elements
        reverse(nums, k, nums.length-1);
    }
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
