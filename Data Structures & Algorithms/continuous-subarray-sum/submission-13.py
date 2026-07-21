class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        if len(nums) <= 1:
            return False
        hm = {0:-1}
        prefix = 0
        for i in range(len(nums)):
            res = prefix + nums[i]
            if res%k in hm:
                if i - hm[res%k] > 1:
                    return True

            else:
                hm[res%k] = i
            prefix = res
        return False