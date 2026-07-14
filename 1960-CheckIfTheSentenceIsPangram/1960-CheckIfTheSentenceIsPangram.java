// Last updated: 7/14/2026, 2:15:54 PM

class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char i = 'a';i<='z';i++){
            if(!sentence.contains(String.valueOf(i)))return false;
        }
        return true;
    }
}