
def cake():
    provided = list(map(int, input().split()))
    n = provided[0]
    a = provided[1]
    b = provided[2]

    if (a > b):
        a,b = b,a
    m = 0
    for i in range (1, n):
        j = a//i
        k = b//(n-i)

        if j >= 1 and k >= 1:
            m = max(m,min(j,k))

    print(m)

# cake()
