package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private static final UserService userService = new UserServiceImpl();
    private static final User user1 = new User("Steve", "Long", (byte) 55);
    private static final User user2 = new User("Git", "Hab", (byte) 45);
    private static final User user3 = new User("Ron", "Garry", (byte) 18);
    private static final User user4 = new User("Malish", "Karlson", (byte) 40);
    public static void main(String[] args) {
//        userService.createUsersTable();
//
//        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
//
//        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
//
//        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
//
//        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
//
//        System.out.println(userService.getAllUsers());
//
//        userService.cleanUsersTable();
//
//        userService.dropUsersTable();

    }

}

