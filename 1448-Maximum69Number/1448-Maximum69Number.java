// Last updated: 7/14/2026, 2:16:13 PM
class Solution {
    public int maximum69Number (int num) {
        
        String s = String.valueOf(num);

        s = s.replaceFirst("6", "9");

        return Integer.parseInt(s);
    }
}
