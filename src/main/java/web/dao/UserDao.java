package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.models.User;

import javax.persistence.EntityManager;
import java.util.List;
@Repository
public interface UserDao {
    void add(User user);
    List<User> getAllUsers();
    void deleteUser(Long id);
    void changeUser(Long id, String name, String surname);
    User getUser(Long id);

}