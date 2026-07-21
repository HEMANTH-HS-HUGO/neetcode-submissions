class Solution:
    def vowelStrings(self, words: List[str], queries: List[List[int]]) -> List[int]:
        pre = []
        vow = "aeiou"
        for i,s in enumerate(words):
            if s[0] in vow and s[-1] in vow:
                if i > 0:
                    pre.append(pre[i-1] + 1)
                else:
                    pre.append(1)
            else:
                if i > 0:
                    pre.append(pre[i-1])
                else:
                    pre.append(0)
        res = []
        def output(p,a,b):
            if a == 0:
                return p[b]
            return p[b]-p[a-1]
        for i in queries:
            z,y = i
            op = output(pre,z,y)
            res.append(op)       
            
        return res