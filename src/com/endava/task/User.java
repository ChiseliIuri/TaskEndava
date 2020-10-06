package com.endava.task;

import java.time.LocalDate;
import java.util.List;

import static com.endava.task.Status.ACTIVE;
import static com.endava.task.Status.BLOCKED;
import static com.endava.task.Status.INACTIVE;
import static com.endava.task.Status.NEW;

public class User {

    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private Status status;
    private LocalDate timeStamp;

    @Override
    public String toString() {
        return "User:" +
                "First Name='" + firstname + '\'' +
                ", Last Name='" + lastname + '\'' +
                ", Age=" + age +
                ", Email='" + email + '\'' +
                ", Time Stamp=" + timeStamp
                +", Status=" + status;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public User(){
    }

    public User(String firstname, String lastname, int age, String email, Status status, LocalDate timeStamp) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.status = status;
        this.timeStamp = timeStamp;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static void  changeStatusFromNewToActive(List<User> userList) {
        for (User user : userList) {
            if (user.getStatus().equals(NEW) && user.getTimeStamp().compareTo(LocalDate.now().minusDays(1)) < 0) {
                user.setStatus(ACTIVE);
            }
        }
    }

    public static void changeStatusFromInactiveToBlocked(List<User> userList) {
        for (User user : userList) {
            if (user.getStatus().equals(INACTIVE) && user.getTimeStamp().compareTo(LocalDate.now().minusMonths(1)) < 0) {
                user.setStatus(BLOCKED);
            }
        }
    }

}
