package se.swmetric.dao;

import se.swmetric.entity.User;

import java.util.List;

public interface UserDao {
    Integer getUserSize();
    List<User> getUsers();
    User getUser(Long id);
    User save(User user);
}
