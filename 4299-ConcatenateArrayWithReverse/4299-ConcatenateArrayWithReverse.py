# Last updated: 7/14/2026, 2:15:14 PM
class Solution:
    def concatWithReverse(self, nums: list[int]) -> list[int]:
        # a = nums[::-1]
        return nums + nums[::-1]