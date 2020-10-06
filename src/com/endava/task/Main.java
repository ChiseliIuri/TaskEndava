package com.endava.task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static com.endava.task.Status.ACTIVE;
import static com.endava.task.Status.INACTIVE;
import static com.endava.task.Status.NEW;
import static com.endava.task.User.changeStatusFromInactiveToBlocked;
import static com.endava.task.User.changeStatusFromNewToActive;

public class Main {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(new User("Andrew", "Watson", 21, "watson@mail.com", NEW,
                LocalDate.of(2019, 9, 22)));

        userList.add(new User("Stas", "Tomson", 19, "stsas@mail.com", INACTIVE,
                LocalDate.of(2019, 6, 5)));

        userList.add(new User("John", "Wick", 25, "wickjo@mail.com", NEW,
                LocalDate.of(2019, 11, 3)));

        userList.add(new User("Michal", "Bulba", 13, "bulbma@mail.com", INACTIVE,
                LocalDate.of(2020, 1, 13)));

        userList.add(new User("Artiom", "Timo", 22, "feev@mail.com", ACTIVE,
                LocalDate.of(2019, 6, 16)));

        userList.add(new User("Cristina", "Faniuk", 21, "stef@mail.com", NEW,
                LocalDate.of(2020, 2, 1)));

        userList.add(new User("Vladimir", "Kutin", 68, "prez@mail.com", NEW,
                LocalDate.now() ));

        System.out.println("INITIAL LIST:");
        for (User user: userList) {
            System.out.println(user);
        }

        changeStatusFromNewToActive(userList);
        System.out.println("\n CHANGED LIST FROM NEW TO ACTIVE:");
        for (User user: userList) {
            System.out.println(user);
        }

        changeStatusFromInactiveToBlocked(userList);
        System.out.println("\n CHANGED LIST FROM INACTIVE TO BLOCKED:");
        for (User user: userList) {
            System.out.println(user);
        }
    }
}
