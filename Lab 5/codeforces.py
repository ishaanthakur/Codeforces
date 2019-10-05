def helper(lastI, position, a):
    if position < 0:
        return
    if a[position] == lastI:
        helper(lastI - 1, position - 1, a)
        print(position + 1)
    else:
        helper(lastI, position - 1, a)

def consecutiveSubsequence():
    n = int(input())
    lastI = 0
    lastIIndex = 0
    maxi = 0
    a = list(map(int, input().split()))
    for i in range(n):
        dp[a[i]] = 0
    for i in range(n):
        if i not in dp:
            dp[i] = 0
    for i in range(n):
        dp[a[i]] = dp[a[i]-1] + 1
        if (dp[a[i]]) > maxi:
            lastIIndex = i
            lastI = a[i]
            maxi = dp[a[i]]
    print(maxi)
    helper(lastI - 1, lastIIndex - 1, a)
    print(lastIIndex + 1)
