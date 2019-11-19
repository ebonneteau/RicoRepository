package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;
import java.util.List;

public interface ApiService {
    List<User> getUsers();
    List<User> generateRandomUser();
    void deleteUser(User username);
}
