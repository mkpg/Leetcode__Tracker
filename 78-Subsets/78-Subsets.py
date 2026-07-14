# Last updated: 7/14/2026, 2:18:57 PM
class Solution(object):
    def subsets(self, nums):
        s = [[]]
        for i in range(len(nums)):
            c = []
            for j in range(len(s)):
                c.append(s[j] + [nums[i]])
            s.extend(c)
        return s