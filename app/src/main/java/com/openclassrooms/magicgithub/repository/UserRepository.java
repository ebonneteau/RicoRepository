package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;



public class UserRepository implements ApiService{


    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        return apiService.getUsers();
    }

    public void generateRandomUser() {

        User.random();
        getUsers().add(User.random());




    }

    public void deleteUser(User user) {
        apiService.deleteUser(user);

    }
}
