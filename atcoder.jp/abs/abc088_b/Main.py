N = int(input())
A = sorted(map(int, input().split()), reverse=True)
print(sum(A[0::2]) - sum(A[1::2]))