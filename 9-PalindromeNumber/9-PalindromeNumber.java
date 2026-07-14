// Last updated: 7/14/2026, 2:19:41 PM
class Solution {
    public boolean isPalindrome(int x) {
        int a,b,c,d;
        a=0;b=0;c=1;d=x;
       if(x>0){
        while(x!=0){
            a=x%10;
            b=b*10+a;
            x=x/10;
        }if(b==d) return true;
        else return false;
       }
       else if(x==0) return true;
       else return false;
} 
}