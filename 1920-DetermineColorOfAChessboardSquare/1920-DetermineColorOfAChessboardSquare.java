// Last updated: 7/14/2026, 2:15:57 PM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        if((coordinates.charAt(0)+coordinates.charAt(1))%2!=0) return true;
        else return false;
    }
}