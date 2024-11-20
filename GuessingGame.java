package guessinggame;

import random;

class GuessingGame {

def guess_the_number(min_num, max_num):
    target_number = random.randint(min_num, max_num)
    attempts = 0
    
    while True:
        guess = int(input(f"Guess the number between {min_num} and {max_num}: "))
        attempts += 1
        
        if guess < target_number:
            print("Too low! Try again.")
        elif guess > target_number:
            print("Too high! Try again.")
        else:
            print(f"Congratulations! You guessed the number {target_number} correctly!")
            print(f"It took you {attempts} attempts.")
            break

# Example usage:
min_number = 1
max_number = 100
guess_the_number(min_number, max_number)

