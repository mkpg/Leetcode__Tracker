// Last updated: 7/14/2026, 2:19:18 PM
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target) return i;
            if(target>nums[i]) return i+1;
        }
        return 0;
    }
}