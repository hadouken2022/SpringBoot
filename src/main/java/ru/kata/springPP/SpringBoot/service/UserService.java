package ru.kata.springPP.SpringBoot.service;


import ru.kata.springPP.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

     User findById(Integer id);

    List<User> findAll();

    void update(int id, User updatedUser);

    void delete(int id);
}
