class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        if len(nums) <= 1:
            return False
        hm = {0:-1}
        prefix = 0
        for i in range(len(nums)):
            prefix = prefix + nums[i]
            if prefix%k in hm:
                if i - hm[prefix%k] > 1:
                    return True

            else:
                hm[prefix%k] = i
            
        return False