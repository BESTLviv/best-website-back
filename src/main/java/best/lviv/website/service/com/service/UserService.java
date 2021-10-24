package best.lviv.website.service.com.service;

import best.lviv.website.service.com.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getUserById(Long userId);

    User createUser(User user);

    User deleteUserById(Long id);
}
