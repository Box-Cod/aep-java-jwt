package com.example.java_jwt.controller;

import com.example.java_jwt.dto.CreateUserDTO;
import com.example.java_jwt.dto.LoginUserDTO;
import com.example.java_jwt.dto.RecoveryJwtTokenDTO;
import com.example.java_jwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<RecoveryJwtTokenDTO> authenticateUser(@RequestBody LoginUserDTO loginUserDTO) {
        RecoveryJwtTokenDTO token = userService.authenticateUser(loginUserDTO);
        return new ResponseEntity<>(token, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody CreateUserDTO createUserDTO) {
        userService.createUser(createUserDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/test")
    public ResponseEntity<String> getAuthenticationTest() {
        return new ResponseEntity<>("Authenticado com sucesso", HttpStatus.OK);
    }

    @GetMapping("/test/user")
    public ResponseEntity<String> getUserAuthenticationTest() {
        return new ResponseEntity<>("Cliente autenticado com sucesso", HttpStatus.OK);
    }

    @GetMapping("/test/admin")
    public ResponseEntity<String> getAdminAuthenticationTest() {
        return new ResponseEntity<>("Administrador autenticado com sucesso", HttpStatus.OK);
    }
}
