package org.example.backquiz.controller;

import org.example.backquiz.entity.User;
import org.example.backquiz.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registeruser")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        System.out.println("salut");
        User newUser = userService.createUser(user);
        return ResponseEntity.ok().body(newUser);

//        return ResponseEntity.ok(newUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") int id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

}
