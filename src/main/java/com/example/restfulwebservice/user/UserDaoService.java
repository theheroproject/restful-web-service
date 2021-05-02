package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Service @을 추가. spring에서 어떤 용도로 사용될지를 결정
@Service
public class UserDaoService {
       private static List<User> users = new ArrayList();
       private static int usersCount = 3;

       static{
           users.add(new User(1,"Kenneth",new Date()));
           users.add(new User(2,"Alice",new Date()));
           users.add(new User(3,"Elena",new Date()));

       }

    public static List<User> findAll() {
        return users;
    }

    public User save(User user){
           System.out.println("User" + user);
           if (user.getId() == null){
               user.setId(++usersCount);
           }
           users.add(user);
           return user;
    }

    public User findOne(int id){
        for (User user: users) {
            if(user.getId() == id){
                return  user;
            }
        }
        return  null;
    }
}
