# Last updated: 7/14/2026, 2:19:53 PM
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        a = nums1+nums2
        a.sort()
        if len(a)%2==0:
            return(a[len(a)//2]+a[(len(a)//2)-1])/2.0
            print(z)
        else:
            return float(a[len(a)//2])