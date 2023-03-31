# file=open("./Demo.txt",'r')
# content=file.read()
# print(content)
# file.close()
with open('./New.txt', 'a') as file:
    file.write('\nThis is a new line added to the file.')
with open('./New.txt', 'r') as file:
    content = file.read()
    print(content)
