
import random

questions = [
    {
        "question": "Father of C Language is?",
        "choices": ["A. Anders Hejslberg", "B. Denis Ritchie", "C. James Gosling", "D. Guido Van Rossum"],
        "answer": "B"
    },
    {
        "question": "Which of the following is not a programming langauages?",
        "choices": ["A. Fortran", "B. COBOL", "C. Lotus", "D. Go"],
        "answer": "C"
    },
    {
        "question": "What does R in RAM stands for?",
        "choices": ["A. Readable", "B. Random", "C. Rewrite", "D. None"],
        "answer": "B"
    },
    {
        "question": "GUI stands for ___________________",
        "choices": ["A. Graphical User Interface", "B. Great User Interface", "C. Graphical Utility Icon", "D. Graphical Utility Interface"],
        "answer": "A"
    },
    {
        "question": "DDL is used to define the structure of a database, including the tables, columns, and data types that it contains. Its full form is? ",
        "choices": ["A. Data Definition Language", "B. Data Design Language", "C. Data Definition Link", "D. None"],
        "answer": "A"
    },
    {
        "question": " First operating system designed using C programming language.",
        "choices": ["A. DOS", "B. WINDOWS", "C. MAC", "D. UNIX"],
        "answer": "D"
    },
]

#Ask Question
def ask_question(question):
    print(question["question"])
    for choice in question["choices"]:
        print(choice)
    answer = input("Enter your answer (A, B, C, or D): ")
    return answer.upper()

#Displays quiz to the user
def play_quiz():
    score = 0
    random.shuffle(questions)
    for question in questions:
        user_answer = ask_question(question)
        if user_answer == question["answer"]:
            print("Correct!")
            score += 1
        else:
            print(f"Incorrect. The correct answer is {question['answer']}.")
    print(f"\nYour final score is {score} out of {len(questions)}.")


play_quiz()




