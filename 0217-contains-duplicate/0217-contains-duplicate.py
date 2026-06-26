class Solution(object):
    from collections import Counter
    def containsDuplicate(self, n):
        return(len(n) != len(set(n)))