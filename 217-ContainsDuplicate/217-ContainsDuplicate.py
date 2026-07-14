# Last updated: 7/14/2026, 2:17:56 PM
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        s = set()
        for num in nums:
            if num in s:
                return True
            s.add(num)
        return False