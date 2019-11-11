def password():
    s = input()
    ans = ""
    for i in range(1, len(s)):
        prefix = s[0:i]
        suffix = s[len(s) - i:]
        if (prefix != suffix):
            continue
        midIndex = s.find(prefix, 1)
        if (midIndex == -1 or midIndex >= len(s) - i):
            continue
        ans = prefix

    if len(ans) > 0:
        print (ans)
    else:
        print("Just a legend")
password()