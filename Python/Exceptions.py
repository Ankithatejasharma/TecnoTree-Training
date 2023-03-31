num1=int(input("Enter the number1 : "))
num2=int(input("Enter the number2 : "))

try:
       if(num1>0 and num2>0):
              res=num1/num2 
              print(res)
       

except:
       if(num2==0):
              print("Zero Division Error")

