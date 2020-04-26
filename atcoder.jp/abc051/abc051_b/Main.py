k, s = map(int, input().split())
r = range(0, k + 1)
cnt = 0
for x in r:
    for y in r:
        if s - k <= x + y <= s:
            cnt += 1
print(cnt)
