package com.probal.configure2db.service.user;

import com.probal.configure2db.model.user.User;
import com.probal.configure2db.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public List<User> saveUsers(List<User> userList) {
        return userRepository.saveAll(userList);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
