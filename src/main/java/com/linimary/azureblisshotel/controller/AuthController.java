package com.linimary.azureblisshotel.controller;

import com.linimary.azureblisshotel.exception.UserAlreadyExistsException;
import com.linimary.azureblisshotel.model.User;
import com.linimary.azureblisshotel.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RequiredArgsConstructor
public class AuthController {
    private final IUserService userService;

    public ResponseEntity<?> registerUser(User user) {
        try {
            userService.registerUser(user);
            return ResponseEntity.ok("Registration successful!");
        } catch (UserAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }
}
