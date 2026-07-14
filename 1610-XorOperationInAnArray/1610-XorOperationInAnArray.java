// Last updated: 7/14/2026, 2:16:04 PM
class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for(int i =0;i < n ; i++){
            nums[i] = start + 2 * i;
        }
        int a = 0 ;
        for(int i = 0;i < n ; i++){
            a = a ^ nums[i]; 
        }
        return a;
    }
}