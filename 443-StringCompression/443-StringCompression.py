# Last updated: 7/27/2026, 11:59:30 AM
class Solution:
    def compress(self, ch: List[str]) -> int:
        s = str(ch[0])
        c = 1

        for i in range(1, len(ch)):
            if ch[i] == ch[i - 1]:
                c += 1
            else:
                if c != 1:
                    s += str(c)
                s += ch[i]
                c = 1

        if c != 1:
            s += str(c)

        ch[:] = list(s)
        return len(ch)