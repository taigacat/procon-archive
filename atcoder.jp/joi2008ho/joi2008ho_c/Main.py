from bisect import bisect

N, M = map(int, input().split())
P = sorted([int(input()) for _ in range(N)] + [0])
ans = 0

li_2 = [P[i] + P[j] for i in range(0, N + 1) for j in range(i, N + 1) if P[i] + P[j] <= M]
li_2.sort()

for l2 in li_2:
    ans = max(ans, l2 + li_2[bisect(li_2, M - l2) - 1])

print(ans)
