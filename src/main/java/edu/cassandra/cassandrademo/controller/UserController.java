package edu.cassandra.cassandrademo.controller;

import edu.cassandra.cassandrademo.pojo.User;
import edu.cassandra.cassandrademo.repo.UserRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    private UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/users")
    public List<User> getUser() {
        List<User> userList = new ArrayList<>();
        userRepo.findAll().forEach(userList::add);
        return userList;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id) {
        return userRepo.findById(id).get();
    }
}
