class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        n = len(nums)
        count = 0
        pre = {0:1}
        s1 = 0
        for i in nums:
            res = s1+i
            if (res - k) in pre:
                count += pre[res-k]
            s1 = res
            pre[res] = pre.get(res,0)+1
        
        return count