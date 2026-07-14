# Last updated: 7/14/2026, 2:17:04 PM
class Solution:
    def minMoves(self, nums: List[int]) -> int:
        mn = min(nums)
        m = 0

        for num in nums:
            m += num - mn

        return m