class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        pre = []
        n = len(nums)
        pre.append(nums[0])
        for i in range(1, n):
            pre.append(pre[i-1]+nums[i])
        for i in range(n):
            l = 0
            r = 0
            if i == 0:
                r = pre[n-1] - pre[i]
            else:
                l = pre[i-1]
                r = pre[n-1] - pre[i]
            if l == r:
                return i
                
        return -1