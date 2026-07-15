# Last updated: 7/15/2026, 12:24:29 PM
class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        d = {}
        j = 1
        for i in nums:
            if i not in d:
                d[i] = 1
            else:
                d[i] += 1
        for k,j in d.items():
            if j == 1:
                return k