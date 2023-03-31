tasks = []

def add_task():
    task = input("Enter task: ")
    tasks.append(task)
    print("Task added successfully!")

def remove_task():
    task = input("Enter task to remove: ")
    if task in tasks:
        tasks.remove(task)
        print("Task removed successfully!")
    else:
        print("Task not found in list.")

def update_task():
    task = input("Enter task to update: ")
    if task in tasks:
        index = tasks.index(task)
        new_task = input("Enter new task: ")
        tasks[index] = new_task
        print("Task updated successfully!")
    else:
        print("Task not found in list.")

def view_tasks():
    print("Tasks:")
    for i, task in enumerate(tasks):
        print(f"{i + 1}. {task}")

while True:
    print("\n1. Add task")
    print("2. Remove task")
    print("3. Update task")
    print("4. View tasks")
    print("5. Exit")
    choice = input("Enter choice: ")

    if choice == "1":
        add_task()
    elif choice == "2":
        remove_task()
    elif choice == "3":
        update_task()
    elif choice == "4":
        view_tasks()
    elif choice == "5":
        break
    else:
        print("Invalid choice. Please try again.")
