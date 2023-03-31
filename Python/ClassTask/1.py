res=lambda x: x * 2
numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]

even_numbers = [x for x in numbers if x % 2 == 0]
odd_numbers = [res(x) for x in numbers if x % 2 != 0]

print("Even numbers:", even_numbers)
print("Odd numbers doubled:", odd_numbers)
