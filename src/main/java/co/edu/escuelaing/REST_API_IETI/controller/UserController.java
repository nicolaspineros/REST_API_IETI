package co.edu.escuelaing.REST_API_IETI.controller;

import co.edu.escuelaing.REST_API_IETI.dto.UserDto;
import co.edu.escuelaing.REST_API_IETI.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAll() {
        //TODO implement this method using UserService
        return null;
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<UserDto> findById(@PathVariable String id ) {
        //TODO implement this method using UserService
        return null;
    }


    @PostMapping
    public ResponseEntity<UserDto> create( @RequestBody UserDto userDto ) {
        //TODO implement this method using UserService
        return null;
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<UserDto> update( @RequestBody UserDto user, @PathVariable String id ) {
        //TODO implement this method using UserService
        return null;
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id ) {
        //TODO implement this method using UserService
        return null;
    }
}

