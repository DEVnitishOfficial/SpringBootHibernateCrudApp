package com.example.registration.controller;

import com.example.registration.model.User;
import com.example.registration.model.Payment;
import com.example.registration.repository.UserRepository;
import com.example.registration.repository.PaymentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    // Create New User
    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // Get All Users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Update User
    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        User user = userRepository.findById(id).orElseThrow();
        user.setName(updatedUser.getName());
        user.setEmail(updatedUser.getEmail());
        user.setMobile(updatedUser.getMobile());
        user.setCourse(updatedUser.getCourse());
        return userRepository.save(user);
    }

    // Delete User
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "User Deleted Successfully!";
    }

    // Pay Fee
    @PostMapping("/pay-fee/{userId}")
    public Payment payFee(@PathVariable Long userId, @RequestBody Payment payment) {
        User user = userRepository.findById(userId).orElseThrow();
        payment.setUser(user);
        return paymentRepository.save(payment);
    }
}
