# Last updated: 7/14/2026, 2:17:01 PM
class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        if num == 1:
            return False

        s = 1  
        i = 2
        while i * i <= num:
            if num % i == 0:
                s += i
                if i != num // i:
                    s += num // i
            i += 1

        return s == num