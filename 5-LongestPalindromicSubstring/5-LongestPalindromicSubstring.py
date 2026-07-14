# Last updated: 7/14/2026, 2:19:47 PM
class Solution(object):
    def longestPalindrome(self, s):

        if len(s) == 1:
            return s

        for l in range(len(s), 0, -1):

            for i in range(len(s) - l + 1):

                sub = s[i:i+l]

                if sub == sub[::-1]:
                    return sub