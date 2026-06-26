class Solution(object):
    def numberToWords(self, num):
        """
        :type num: int
        :rtype: str
        """
        if num == 0:
            return "Zero"

        below_20 = ["One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                    "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"]

        below_100 = ["Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"]

        thousands = ["", "Thousand", "Million", "Billion"]

        def helper(num):
            if num == 0:
                return ""
            elif num < 20:
                return below_20[num - 1] + " "
            elif num < 100:
                return below_100[(num) // 10 - 2] + " " + helper(num % 10)
            else:
                return below_20[(num) // 100 - 1] + " Hundred " + helper(num % 100)

        result = ""
        for _, thousand in enumerate(thousands):
            if num % 1000 != 0:
                result = helper(num % 1000) + thousand + " " + result
            num //= 1000

        return result.strip()