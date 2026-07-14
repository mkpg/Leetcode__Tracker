# Last updated: 7/14/2026, 2:15:53 PM
class Solution:
    def numOfStrings(self, a: List[str], b: str) -> int:
        cn = 0 
        for i in a:
            if i in b:
                cn+=1
        return cn