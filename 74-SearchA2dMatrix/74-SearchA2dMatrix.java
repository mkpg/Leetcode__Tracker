// Last updated: 7/14/2026, 2:19:01 PM
class Solution {
    public boolean searchMatrix(int[][] aa, int target) {
        for(int i = 0 ; i < aa.length;i++ ){
            for(int j = 0 ;  j < aa[i].length;j++){
                if(aa[i][j]==target)return true;
                 
            }

        }return false;
    }
}