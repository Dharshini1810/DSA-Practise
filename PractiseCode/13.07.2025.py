n = int(input())
m = int(input())
k = int(input())
s = input().strip()
t = input().strip()

def find_substring(sub):
    l = []
    for i in range(len(sub)):
        for j in range(i, len(sub)):
            l.append(sub[i:j+1])
    return l 

s_sub = find_substring(s)
t_sub = find_substring(t)

def find_combinations(com):
    com1 = com
    l1 = []
    for i in range(len(com1)):
        i=0
        com = com[i+1:]+com[i]
        l1.append(com)
        # com = new
    # l1.append(com1[-1]+com1[1:])
    return l1 


interleave_arr = []
for i in range(len(s_sub)): 
    for j in range(len(t_sub)):
        print(s_sub[i]+t_sub[j]+"=="+str(find_combinations(s_sub[i]+t_sub[j])))
        interleave_arr.extend(find_combinations(s_sub[i]+t_sub[j]))

cnt = 0
print(interleave_arr)
# print(len(interleave_arr))
for i in interleave_arr:
    if len(i) >= 2:
        if (ord(i[0]) - ord(i[-1]) <= k) or (ord(i[-1]) - ord(i[0]) <= k):
            cnt+=1 
print("Output: "+str(cnt))




# Sample Input and Output

[?2004l
2
2
1
ab
ab
aa==['aa', 'aa']
aab==['aba', 'baa', 'aab']
ab==['ba', 'ab']
aba==['baa', 'aab', 'aba']
abab==['baba', 'abab', 'baba', 'abab']
abb==['bba', 'bab', 'abb']
ba==['ab', 'ba']
bab==['abb', 'bba', 'bab']
bb==['bb', 'bb']
['aa', 'aa', 'aba', 'baa', 'aab', 'ba', 'ab', 'baa', 'aab', 'aba', 'baba', 'abab', 'baba', 'abab', 'bba', 'bab', 'abb', 'ab', 'ba', 'abb', 'bba', 'bab', 'bb', 'bb']
Output: 24
[?2004h
