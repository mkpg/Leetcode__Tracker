// Last updated: 7/14/2026, 2:18:34 PM
class Solution {
    // static{
    //     for(int i = 0; i<500;i++){
    //         singleNumber(new int[]{});
    //     }
    // }
    public static int singleNumber(int[] nums) {
        int i = 0;
        int x = 0;
        while(i<nums.length){
            x ^= nums[i];
            i++;
        }
        return x;
    }
}