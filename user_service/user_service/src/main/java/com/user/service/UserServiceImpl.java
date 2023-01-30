package com.user.service;


import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //fake UserList details :: we should pick these values from Database ideally.
  private   List<User> list = List.of(
            new User(1223l,"8896308497","Ujjawal Srivastava"),
            new User(1212l,"8896308000","Aseem Sharma"),
            new User(1224l,"8896308497","Ujjawal Srivastava")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
