// Last updated: 7/14/2026, 2:19:45 PM
class Solution {
    public int reverse(int x) {
        int Return=0;
        int sign=1;
        if(x < 0){
            x=x*-1;
            sign=-1;
        }
        while(x > 0){
            
            if(Return > Integer.MAX_VALUE/10)    
              return 0;
            Return =(Return*10)+ x%10;
            x=x/10;
        }
        if(sign == -1)
            return Return*-1;
        else
            return Return;
    }
}