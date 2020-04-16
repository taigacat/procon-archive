cnt = int(input())
natural_numbers = [int(x) for x in input().split()]


def is_all_numbers_even_check(li) -> bool:
    is_all_numbers_even = True
    for x in li:
        # 奇数の場合、is_all_numbers_evenにFalseを代入
        if x % 2 == 1:
            is_all_numbers_even = False

    return is_all_numbers_even


iterable_count = 0

while is_all_numbers_even_check(natural_numbers):
    natural_numbers = [int(x / 2) for x in natural_numbers]
    iterable_count += 1

print(iterable_count)
