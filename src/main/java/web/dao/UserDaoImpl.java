package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void add(User user) {
        entityManager.persist(user);
    }

    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u").getResultList();
    }

    public void deleteUser(Long id) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            entityManager.remove(user);
        }
    }

    public void changeUser(Long id, String name, String surname) {
        User user = entityManager.find(User.class, id);
        if (user != null) {
            user.setName(name);
            user.setSurname(surname);
            entityManager.merge(user);
        }
    }

    public User getUser(Long id) {
        return entityManager.find(User.class, id);
    }
}
