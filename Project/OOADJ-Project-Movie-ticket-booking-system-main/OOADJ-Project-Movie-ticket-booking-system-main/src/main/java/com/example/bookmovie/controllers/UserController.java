package com.example.bookmovie.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookmovie.models.Login;
import com.example.bookmovie.models.User;
import com.example.bookmovie.payloadResponse.LoginMessage;
import com.example.bookmovie.service.UserService;

@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAll() {
        return userService.getUsers();
    }

    @PostMapping("/register")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Login login) {
        LoginMessage loginMessage = userService.loginUser(login);
        if (loginMessage.getStatus()) {
            System.out.println(loginMessage.getEmail());
            return "redirect:/";
        } else
            return "User Not Found";
    }

    @GetMapping("/users/{userId}")
    public User getById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/users/email/{email}")
    public User getByEmailId(@PathVariable String email) {
        return userService.getUserByEmailId(email);
    }

    @DeleteMapping("/deleteUsers/{userId}")
    public String deleteBooking(@PathVariable Integer userId, RedirectAttributes redirectAttributes) {
        if (userService.deleteUser(userId)) {
            redirectAttributes.addFlashAttribute("message", "Delete Success");
        } else {
            redirectAttributes.addFlashAttribute("message", "Delete Failure");
        }

        return "redirect:/users";
    }

    
}