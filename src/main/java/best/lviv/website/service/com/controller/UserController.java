package best.lviv.website.service.com.controller;

import best.lviv.website.service.com.model.User;
import best.lviv.website.service.com.service.UserService;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long userId){
        return userService.getUserById(userId);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable("id") Long id){
        return userService.deleteUserById(id);
    }
}
