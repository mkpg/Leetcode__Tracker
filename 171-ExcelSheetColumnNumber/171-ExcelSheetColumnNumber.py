# Last updated: 7/14/2026, 2:18:15 PM
class Solution:
    def titleToNumber(self, a: str) -> int:
        n = 0
        for i in a:
            d = ord(i)-65
            n = n*26+(d+1)
        return(n)