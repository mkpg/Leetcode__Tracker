# Last updated: 7/14/2026, 2:17:23 PM
class Solution:
    def reverseVowels(self, s: str) -> str:
        s = list(s)
        v = set('AEIOUaeiou')
        l = 0
        r =len(s)-1
        while l<r:
            if s[l] in v:
                if s[r] in v:
                    s[l],s[r] = s[r],s[l]
                    l+=1
                    r-=1
                else:
                    r-=1
            else:
                l+=1
        dd=''
        return ''.join(s)