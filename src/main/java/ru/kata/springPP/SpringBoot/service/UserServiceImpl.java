package ru.kata.springPP.SpringBoot.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.springPP.SpringBoot.dao.UserDao;
import ru.kata.springPP.SpringBoot.model.User;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);

    }

    @Transactional(readOnly = true)
    @Override
    public User findById(Integer id) {
        return userDao.findById(id);

    }

    @Transactional(readOnly = true)
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Transactional
    @Override
    public void update(int id, User updatedUser) {
        userDao.update(updatedUser);
    }

    @Transactional
    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
