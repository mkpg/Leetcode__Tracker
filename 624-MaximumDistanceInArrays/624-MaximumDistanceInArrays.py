# Last updated: 7/27/2026, 11:56:48 AM
class Solution:
    def maxDistance(self, a: List[List[int]]) -> int:
        gm = min(a[0])
        gx = max(a[0])
        ans = 0

        for i in range(1,len(a)):
            cm = min(a[i])
            cx = max(a[i])
            z = abs(gx - cm)
            x = abs(cx - gm)
            ans = max(ans,z,x)
            gx = max(gx,cx)
            gm = min(gm,cm)
        return ans

        
        # b = []
        # m = 0
        # ind = 0
        # for i in range(len(a)):
        #     for j in range(len(a[i])):
        #         if a[i][j]>m:
        #             m = a[i][j]
        #             ind = i
        # a.pop(ind)

        # for i in a:
        #     for j in i:
        #         b.append(j)
        
        # j = abs(m - min(b))
        # return j