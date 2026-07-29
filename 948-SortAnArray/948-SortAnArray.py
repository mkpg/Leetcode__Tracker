# Last updated: 7/29/2026, 11:16:22 AM
class Solution:
    def sortArray(self, arr: List[int]) -> List[int]:
        # if len(arr)<=1:
        #     return arr
        # def heap(a,n,i):
        #     big = i
        #     l = 2*i+1
        #     r = 2*i+2
        #     if l<n and a[l]>a[big]:big = l
        #     if r < n and a[r]>a[big]:big = r

        #     if big!=i:
        #         a[big],a[i] = a[i],a[big]
        #         heap(a,n,big)
        # n = len(arr)
        # for i in range(n//2-1,-1,-1):
        #     heap(arr,n,i)
        # arr[0],arr[n-1] = arr[n-1],arr[0]
        # return self.sortArray(arr[:n-1])+[arr[n-1]]
        arr.sort()
        return arr