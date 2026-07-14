// Last updated: 7/14/2026, 2:18:03 PM
class Solution {
    public boolean isHappy(int n) {
        int t = 0;
        int d = 0;
        if(n==2)return false;
        else{
        while(n != 1 && n != 4){
            while(n>0){
                d = n%10;
                t = t+(d*d);
                n=n/10;
            }
            n=t;
            t=0; 
        }
        if(n==1)return true;
        else return false;}
        
    }
}