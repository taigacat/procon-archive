N = [tuple(map(int, input().split())) for i in range(int(input()))]
N.sort(key=lambda x: x[0])
movable = True
for i, current in enumerate(N):
    last = N[i - 1] if i > 0 else (0, 0, 0)
    time_diff = current[0] - last[0]
    diff = abs(current[1] - last[1]) + abs(current[2] - last[2])
    if time_diff - diff < 0 or (time_diff - diff) % 2 == 1:
        movable = False
        break

print('Yes' if movable else 'No')
