package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    void deleteUserById(Long id);

    User findUserById(Long id);

    void updateUser(User user);
}
