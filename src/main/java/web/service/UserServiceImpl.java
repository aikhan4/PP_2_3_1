package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.models.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void add(User user) {
        userDao.add(user);
    }
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }
    public void changeUser(Long id, String name, String surname) {
        userDao.changeUser(id, name, surname);
    }
    public User getUser(Long id) {
        return userDao.getUser(id);
    }

}
