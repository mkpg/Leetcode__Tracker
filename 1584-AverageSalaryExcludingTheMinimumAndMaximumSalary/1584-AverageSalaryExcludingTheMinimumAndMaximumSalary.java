// Last updated: 7/14/2026, 2:16:08 PM
class Solution {
    public double average(int[] sal) {
        Arrays.sort(sal);
        double g = 0,c=0;
        for(int i=1;i<sal.length-1;i++){
            g = g + sal[i];
            c++;
        }
        return (g/c);

    }
}