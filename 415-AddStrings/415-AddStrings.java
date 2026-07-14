// Last updated: 7/14/2026, 2:17:10 PM
import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
         BigInteger num3 = new BigInteger(num1);
          BigInteger num4 = new BigInteger(num2);
        BigInteger a = num3.add(num4);
        return a.toString();
    }
}