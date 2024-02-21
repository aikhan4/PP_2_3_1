package web.service;

import org.springframework.stereotype.Service;
import web.models.User;

import java.util.List;

@Service
public interface UserService {
    void add(User user);
    List<User> getAllUsers();
    void deleteUser(Long id);
    void changeUser(Long id, String name, String surname);
    User getUser(Long id);
}
