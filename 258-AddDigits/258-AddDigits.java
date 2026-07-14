// Last updated: 7/14/2026, 2:17:45 PM
class Solution {
    public int addDigits(int num) {
        if(num<9) return num;
        int ans = num%9;
        if(num!=0&&ans==0) return 9;
        else return ans;
    }
}