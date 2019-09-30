import bisect
def interestingDrink():
    count = 0
    n = int(input())
    x = []
    x = list(map(int, input().split()))
    q = int(input())
    m = []
    for j in range(q):
        m.append(int(input()))
    x.sort()
    for k in range(q):
        print(bisect.bisect_right(x, m[k]))
# interestingDrink()

dp = {}