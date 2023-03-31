import time

def decorator(func):
    def wrapper():
        start=time.time()
        func()
        end=time.time()
        print("Time taken to execute:",round((end-start),3)," seconds")
    return wrapper


@decorator
def prgm():
    a=input("Enter the the text!!")
    print(a)
    print("String Processed!!")
    print("Executed!!")
prgm()
    