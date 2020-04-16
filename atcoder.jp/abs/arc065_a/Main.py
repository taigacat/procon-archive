keywards = ['dreamer', 'dream', 'eraser', 'erase']
S = input()
T = ['']

while [t for t in T if S.startswith(t)]:
    candidate = [t + k for t in T for k in keywards if S.startswith(t + k)]
    T = candidate
    if S in T:
        print('YES')
        exit(0)

print('NO')
exit(0)
