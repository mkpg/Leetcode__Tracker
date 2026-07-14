// Last updated: 7/14/2026, 2:19:57 PM

class Solution {
    public int[] twoSum(int[] arr, int x){
        int[] ans = new int[2];
        int n = arr.length;
        // solution
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
        }
}
    