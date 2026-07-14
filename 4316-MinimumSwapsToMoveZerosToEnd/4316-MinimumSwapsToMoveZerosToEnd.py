# Last updated: 7/14/2026, 2:15:18 PM
class Solution:
    def minimumSwaps(self, nums: list[int]) -> int:
        l = 0 ; 
        r = len(nums)-1
        c = 0
        while l<r:
            while l<r and nums[l]!=0:
                l+=1
            while l<r and nums[r]==0:
                r-=1
            # while nums[r] == 0 :
            #     r-=1
            
            if nums[l] == 0 and l<r:
                nums[l],nums[r]=nums[r],nums[l]
                l+=1
                r-=1
                c+=1
        return c
