# Last updated: 7/29/2026, 11:14:34 AM
1class Solution:
2    def minMoves(self, nums: List[int]) -> int:
3        mn = min(nums)
4        ch = 0 
5        for i in nums:
6            ch+=i-mn
7        return ch