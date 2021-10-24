package best.lviv.website.service.com.service;

import best.lviv.website.service.com.dao.UserDao;
import best.lviv.website.service.com.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getUsers() {
        return userDao.findAll();
    }
    @Override
    public User getUserById(Long id) {
        return userDao.findById(id).get();
    }
    @Override
    public User createUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User deleteUserById(Long id) {
        User userById = getUserById(id);
        userDao.deleteById(id);
        return userById;
    }
}
