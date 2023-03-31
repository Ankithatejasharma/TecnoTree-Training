#Smallest and Large
numbers = input("Enter a list of numbers separated by spaces: ").split()
numbers = [int(num) for num in numbers]
numbers.sort()

small =numbers[0]
large = numbers[-1]

print("Smallest number:", small)
print("Largest number:", large)