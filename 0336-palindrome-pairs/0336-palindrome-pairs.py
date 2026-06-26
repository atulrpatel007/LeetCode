class Solution:
    def palindromePairs(self, words):
        res = []
        word_map = {w: i for i, w in enumerate(words)}
        def is_palindrome(s):
            return s == s[::-1]
        for i, w in enumerate(words):
            n = len(w)
            for cut in range(n + 1):
                prefix = w[:cut]
                suffix = w[cut:]
                if is_palindrome(prefix):
                    rev = suffix[::-1]
                    if rev in word_map and word_map[rev] != i:
                        res.append([word_map[rev], i])
                if cut != n and is_palindrome(suffix):
                    rev = prefix[::-1]
                    if rev in word_map and word_map[rev] != i:
                        res.append([i, word_map[rev]])
        return res