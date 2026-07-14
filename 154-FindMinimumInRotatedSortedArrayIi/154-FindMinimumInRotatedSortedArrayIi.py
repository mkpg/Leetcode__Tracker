# Last updated: 7/14/2026, 2:18:23 PM
class Solution:
    def findMin(self, nums: List[int]) -> int:
        l = 0 
        r = len(nums)-1
        mid = 0
        while l<r:
            mid = l + (r-l)//2
            if nums[mid]>nums[r]:
                l = mid+1
            elif nums[mid]<nums[r]:
                r = mid
            else:
                r-=1
        return nums[l]