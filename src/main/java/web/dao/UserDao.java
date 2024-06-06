package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    void deleteUser(User user);

    void deleteUserById(Long id);

    User findUserById(Long id);

    void updateUser(User user);

}
