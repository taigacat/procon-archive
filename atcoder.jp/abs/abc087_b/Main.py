a = int(input())
b = int(input())
c = int(input())
x = int(input())
pattern_count = 0

for num in [500 * i + 100 * j + 50 * k for i in range(a + 1) for j in range(b + 1) for k in range(c + 1)]:
    if num == x:
        pattern_count += 1

print(pattern_count)
