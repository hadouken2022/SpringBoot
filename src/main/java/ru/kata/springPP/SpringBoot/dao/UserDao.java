package ru.kata.springPP.SpringBoot.dao;



import ru.kata.springPP.SpringBoot.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    User findById(Integer id);

    List<User> findAll();

    void update(User updatedUser);

    void delete(int id);


}
