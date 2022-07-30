package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Foma", "Fomin", (byte) 45);
        userService.saveUser("Robin", "Bobin", (byte) 25);
        userService.saveUser("Ken", "Barbin", (byte) 13);
        userService.saveUser("Ilya", "Muromets", (byte) 33);

        userService.getAllUsers().forEach(System.out::println);

        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
