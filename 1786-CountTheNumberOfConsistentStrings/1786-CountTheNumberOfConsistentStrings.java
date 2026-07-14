// Last updated: 7/14/2026, 2:16:01 PM
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> a = new HashSet<>();
        for(char al:allowed.toCharArray()){
            a.add(al);
        }
        int cnt = 0 ;
        for(String st:words){
            boolean cns = true;
            for(char c:st.toCharArray()){
                if(!a.contains(c)){cns=false;break;}
            }
            if(cns) cnt++;
        }return cnt;
    }
}