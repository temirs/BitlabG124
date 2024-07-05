package Interfaces;

public class UserBeanImp implements UserBean {
    User[] users;

    public UserBeanImp(User[] users) {
        this.users = users;
    }

    @Override
    public void getAllUsers() {
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getName() + " " + users[i].getSurname());
        }
    }

    @Override
    public void getUsersByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equalsIgnoreCase(name)) {
                System.out.println(users[i].getName() + " " + users[i].getSurname());
            }
        }
    }

    @Override
    public void getUsersBySurname(String surname) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getSurname().equalsIgnoreCase(surname)) {
                System.out.println(users[i].getName() + " " + users[i].getSurname());
            }
        }
    }
}
