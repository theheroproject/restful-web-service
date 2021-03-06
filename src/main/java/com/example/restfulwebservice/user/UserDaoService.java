package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

//Service @을 추가. spring에서 어떤 용도로 사용될지를 결정
@Service
public class UserDaoService {
       private static List<User> users = new ArrayList();
       private static int usersCount = 3;

       static{
           users.add(new User(1,"Kenneth",new Date(),"pass1","701010-1111111"));
           users.add(new User(2,"Alice",new Date(),"pass2","701010-1111111"));
           users.add(new User(3,"Elena",new Date(),"pass3","701010-1111111"));

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

    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()){
            User user = iterator.next();

            if (user.getId() == id ){
                iterator.remove();
                return  user;
            }
        }
        return  null;
    }
}