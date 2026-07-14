// Last updated: 7/14/2026, 2:15:45 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==0) return true;
        int a = num % 10;
        if(a==0) return false;
        return true;
    }
}