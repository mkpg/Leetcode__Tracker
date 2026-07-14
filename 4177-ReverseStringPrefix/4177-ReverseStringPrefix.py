# Last updated: 7/14/2026, 2:15:12 PM
class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        s = list(s)
        l = 0
        r = k-1
        while l<r:
            s[l],s[r]=s[r],s[l]
            l+=1
            r-=1
        return "".join(s)