N, Y = map(int, input().split())
candidate = [{'x': x, 'y': y, 'z': (N - x - y)}
             for x in range(N + 1) for y in range(N - x + 1)
             if x * 10000 + y * 5000 + (N - x - y) * 1000 == Y]
print('{x} {y} {z}'.format(**candidate[0] if len(candidate) > 0 else {'x': -1, 'y': -1, 'z': -1}))
