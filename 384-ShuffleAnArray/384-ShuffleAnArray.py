# Last updated: 7/27/2026, 11:59:38 AM
import random

class Solution:

    def __init__(self, nums):
        self.original = nums[:]

    def reset(self):
        return self.original[:]

    def shuffle(self):
        arr = self.original[:]
        n = len(arr)

        for i in range(n):
            j = random.randint(i, n - 1)
            arr[i], arr[j] = arr[j], arr[i]

        return arr


# Your Solution object will be instantiated and called as such:
# obj = Solution(nums)
# param_1 = obj.reset()
# param_2 = obj.shuffle()