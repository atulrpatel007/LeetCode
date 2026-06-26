class Solution(object):
    def searchInsert(self, n, t):
        a = 0
        if t in n:
            a = n.index(t)
        else:
            n.append(t)
            n.sort()
            a = n.index(t)
        return a

class Solution(object):
    def searchInsert(self, n, t):
     n.append(t)
     n.sort()
     return n.index(t)