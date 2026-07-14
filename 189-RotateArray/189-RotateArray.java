// Last updated: 7/14/2026, 2:18:17 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int a,b;
        k=k%nums.length;
        int start=0;
        int end = nums.length-1;
        rev(start,end,nums);
        rev(0,k-1,nums);
        rev(k,end,nums);
    }
    public static void rev(int start,int end,int[] nums){
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}