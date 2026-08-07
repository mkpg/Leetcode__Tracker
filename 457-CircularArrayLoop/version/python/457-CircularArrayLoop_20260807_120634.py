# Last updated: 8/7/2026, 12:06:34 PM
class Solution:
    def circularArrayLoop(self, nums: List[int]) -> bool:
        n = len(nums)

        def next(i):
            return (i + nums[i]) % n

        for i in range(n):
            if nums[i] == 0:
                continue

            d = nums[i] > 0
            s = i
            f = i

            while True:
                ns = next(s)
                nf = next(f)

                if nums[s] == 0 or (nums[s] > 0) != d:
                    break


                if nums[f] == 0 or (nums[f] > 0) != d:
                    break
                if nums[nf] == 0 or (nums[nf] > 0) != d:
                    break
                s = ns
                f = next(nf)

                if s == f:
                    if s == next(s):
                        break
                    return True

            j = i
            while nums[j] != 0 and (nums[j] > 0) == d:
                k = next(j)
                nums[j] = 0
                j = k

        return False