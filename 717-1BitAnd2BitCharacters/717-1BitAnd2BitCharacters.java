// Last updated: 7/14/2026, 2:16:44 PM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i =0;
        while(i<bits.length-1){
            i+=bits[i]+1;
        }
        return i == bits.length -1;
    }
}