#Even Sum 
numbers = input("Enter a list of numbers separated by spaces: ").split()

sum = 0

for num in numbers:
    if int(num) % 2 == 0:
        sum += int(num)

print("The sum of all even numbers in the list is:",sum)
