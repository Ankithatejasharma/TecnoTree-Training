#Calculator

def divide(x, y):
    try:
        return x/y
    except:
        if( y==0):
           print("Zero Division Error")

while True:
    print("Select operation:")
    print("+=> Add")
    print("-=> Subtract")
    print("*=> Multiply")
    print("/=> Divide")
    print("E=> Exit")
    choice = input("Enter choice \n ")

    if choice == 'E':
        break

    try:
        num1 = float(input("Enter first number: "))
        num2 = float(input("Enter second number: "))
    except ValueError:
        print("Invalid input. Please enter a number.")
        continue

    if choice == '+':
        print( num1+num2)
    elif choice == '-':
        print(num1-num2)
    elif choice == '*':
        print( num1*num2)
    elif choice == '/':
            print(divide(num1, num2))
    else:
        print("Invalid choice. Please enter a valid choice")

    
    
    
    
       
