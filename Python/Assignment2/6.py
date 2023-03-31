#Longest Words
def findlongest(words):
    longest= ""
    for word in words:
        if len(word) > len(longest):
            longest = word
    return longest

words = ["Xavier", "Enid", "TheAddamsFamily", "WednesdayAddams"]
longest = findlongest(words)
print(longest)
