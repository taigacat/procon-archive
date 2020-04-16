N, A, B = map(int, input().split())
answer = 0

for n in range(N + 1):
    digit_sum = sum(list(map(int, list(str(n)))))
    # print(digit_sum)

    if A <= digit_sum <= B:
        answer += n

print(answer)
