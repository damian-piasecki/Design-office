package pl.my.programisci.eduapp.service;

import pl.my.programisci.eduapp.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(long id);
}