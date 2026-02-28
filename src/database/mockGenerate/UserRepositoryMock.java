package database.mockGenerate;

import java.util.List;

import database.UserRepository;
import models.User;

public class UserRepositoryMock implements UserRepository{
    private List<User> users;


    public UserRepositoryMock(int quantity) {
        users = UserMockFactory.generateUsers(quantity);
    }

    @Override
    public List<User> getall() {
        return users;
    }
}
