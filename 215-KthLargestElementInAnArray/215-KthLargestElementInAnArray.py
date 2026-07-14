# Last updated: 7/14/2026, 2:17:54 PM
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        nums.sort()
        return nums[-k]  