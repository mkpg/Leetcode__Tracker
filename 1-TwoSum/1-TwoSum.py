# Last updated: 7/14/2026, 2:19:55 PM
class Solution(object):
    def twoSum(self, nums, target):
        tgn = {}
        for i in range(len(nums)):
            cnum = nums[i]

            if cnum in tgn:
                return [tgn[cnum],i]
            com = target - cnum
            tgn[com] = i