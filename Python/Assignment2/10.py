#String Palindrome
def filter(words):
    
    palindromes = []
    for word in words:
        if word == word[::-1]:
            palindromes.append(word)
    return palindromes
my_words = ["racecar", "hello", "level", "world", "angna" , "malayalam"]
print(filter(my_words))