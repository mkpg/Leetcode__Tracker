// Last updated: 7/14/2026, 2:17:32 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 1){ return true;}
        if(n<=0) return false;
        if(n%3!=0)return false;
        
        return(isPowerOfThree(n/3));
        
        }
    
}