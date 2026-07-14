// Last updated: 7/14/2026, 2:15:26 PM
class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int a = 0 ;
        for(int i = 0;i < nums.length -1 ;i = i+2){
                a = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = a;  
            }
        return nums;
        }
        
    }
