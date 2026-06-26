class Solution:
    def maximum69Number(self, num):
        if num>=0:
           return int(str(num).replace('6', '9', 1))
        elif num<0:
            return int(str(num).replace('9', '6', 1))