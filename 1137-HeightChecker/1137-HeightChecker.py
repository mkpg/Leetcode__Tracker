# Last updated: 7/14/2026, 2:16:19 PM
class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        a = sorted(heights)
        b = 0

        for c in range(len(heights)):
            if heights[c] != a[c]:
                b += 1

        return b