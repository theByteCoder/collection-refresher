package com.sets;

import com.Gender;
import com.User;

import java.util.HashSet;
import java.util.Set;

public class CustomSet {

    public static void main(String[] args) {
        Set<User> userSet = new HashSet<>();
        userSet.add(new User(1, "User 1", "u1@gmail.com", Gender.MALE));
        userSet.add(new User(2, "User 2", "u2@gmail.com", Gender.FEMALE));
        userSet.add(new User(3, "User 3", "u3@gmail.com", Gender.MALE));
        userSet.add(new User(4, "User 4", "u4@gmail.com", Gender.MALE));
        userSet.add(new User(5, "User 5", "u5@gmail.com", Gender.FEMALE));
        userSet.add(new User(1, "User 1", "u1@gmail.com", Gender.MALE)); // duplicate of u1

        /* hashCode() and equals() of custom classes allow hashSet to determine
        if duplicate objects instance of the class are present in set.
        @Data from lombok implement hashCode and equal internally */
        userSet.stream().forEach(System.out::println);
    }
}
