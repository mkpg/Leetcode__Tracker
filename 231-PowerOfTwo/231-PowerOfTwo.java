// Last updated: 7/14/2026, 2:17:50 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        
        int a = 0;
        for(int i = 0 ; i<31;i++){
            a = (int)Math.pow(2,i);
            if(n==a)return true;
        }
        return false;
    }
}