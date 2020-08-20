package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        users.add(new User("hung","1234","nguyen manh hung","hung@gmail.com",23)) ;
        users.add(new User("admin","1234","admin","admin@gmail.com",18)) ;

    }

    public static User checkLogin(Login login){
        for(User u:users){
            if(u.getAccount().equalsIgnoreCase(login.getAccount())
            && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }

}
