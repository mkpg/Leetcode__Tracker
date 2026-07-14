# Last updated: 7/14/2026, 2:17:44 PM
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        for i in set(s):
            if s.count(i)!=t.count(i):
                return False
        return True