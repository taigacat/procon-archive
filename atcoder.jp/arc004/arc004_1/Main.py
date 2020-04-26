from math import sqrt

n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]

length_list = [(p1[0] - p2[0]) ** 2 + (p1[1] - p2[1]) ** 2 for p1 in points for p2 in points]
print(sqrt(max(length_list)))
