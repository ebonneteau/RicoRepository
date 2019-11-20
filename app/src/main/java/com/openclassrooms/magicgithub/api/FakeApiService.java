package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.List;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class FakeApiService implements ApiService {

    private List<User> users = generateUsers();
    //private User random = generateRandomUser(); //@Rico Added Attribute random




    /**
     * Return a list of {@link User}
     * Those users must be generated by {@link FakeApiServiceGenerator}
     */
    @Override
    public List<User> getUsers() {
        return users;

    }// TODO: A modifier





    /**
     * Generate a random {@link User} and add it {@link FakeApiService#users} list.
     * This user must be get from the {@link FakeApiServiceGenerator#FAKE_USERS_RANDOM} list.
     * @return
     */
    @Override
    public void generateRandomUser() {
        // TODO: A modifier
    }


        // TODO: A modifier



    /**
     * Delete a {@link User} from the {@link FakeApiService#users} list.
     */
    @Override
    public void deleteUser(User user) {
        
        // TODO: A modifier
    }
}
