package Abstraction;

public class ERPSystem {
    User[] memory = new User[1000]; ////максимум 1000 пользователей
    int sizeOfUsers = 0;

    public void addUser(User u) {  //// метод добавляет пользователя
        memory[sizeOfUsers] = u;
        sizeOfUsers++;
    }

    public void printTeacher() {  //// метод выводит на экран экземпляры класса Teacher
        for (int i = 0; i < sizeOfUsers; i++) {
            if (memory[i] instanceof Teacher) {
                System.out.println(memory[i].getUserData());
            }
        }
    }

    public void printStudent() {  //// метод выводит на экран экземпляры класса Student
        for (int i = 0; i < sizeOfUsers; i++) {
            if (memory[i] instanceof Student) {
                System.out.println(memory[i].getUserData());
            }
        }
    }

    public void printUser(int index) { //// метод выводит на экран одного пользователя, но если пользователь по данному индексу не существует, то выводит сообщение: "No such user in this index".
        if (memory[index] != null) {
            System.out.println(memory[index].getUserData());
        } else {
            System.out.println("No such user in this index");
        }
    }
}
