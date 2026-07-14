// Last updated: 7/14/2026, 2:16:16 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int e=0 , o=0;
        for(int i=0;i<position.length;i++)
        {
            if(position[i] % 2 ==0) e++;
            else o++;
        }
        return Math.min(o,e);
    }
}