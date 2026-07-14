// Last updated: 7/14/2026, 2:16:21 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i =0 ; i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}