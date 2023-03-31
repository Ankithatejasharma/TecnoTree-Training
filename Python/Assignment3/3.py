#HangMan
import random

word_list = ['hangman', 'mango', 'keyboard', 'joystick', 'helloworld', 'climate', 'weather', 'bag']

secret_word = random.choice(word_list)

guessed_letters = ['_' for _ in secret_word]

max_guesses = 10

num_guesses = 0

while num_guesses < max_guesses and '_' in guessed_letters:
    
    print(' '.join(guessed_letters))
    
   
    guess = input('Guess a letter: ').lower()
    
    if guess in secret_word:

        for i, letter in enumerate(secret_word):
            if letter == guess:
                guessed_letters[i] = letter
        print('Correct!')
    else:
        print('Incorrect!')
        num_guesses += 1
    
    print(f'Guesses remaining: {max_guesses - num_guesses}')
    

if '_' not in guessed_letters:
    print('Congratulations, you guessed the word!')
else:
    print(f'Sorry, you ran out of guesses. The word was "{secret_word}".')
