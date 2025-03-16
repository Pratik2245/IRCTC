package org.example.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class userServices {
    List<User> userList;
    private  static  final String user_path="C:/Users/paith/irctcapp/app/src/main/java/org/example/localDB/user.json";
//    In Java, ObjectMapper is a class from the Jackson library, primarily used for converting Java
//    objects to JSON and vice versa
    private  ObjectMapper objectMapper=new ObjectMapper();
    private User user;
    userServices(User user1) throws IOException {
        this.user=user1;
        File file=new File(user_path);
//      user are using Typereference beacuse we are putting user at runtime so the IOException can occur
//        so we are using it
        userList=objectMapper. readValue(file, new TypeReference<List<User>>() {
        });
    }
}
