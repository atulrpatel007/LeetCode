class Solution(object):
    def twoSum(self, n, t):
        d = {}
        for i, x in enumerate(n):
            if t - x in d:
                return [d[t - x] + 1, i + 1]
            d[x] = i