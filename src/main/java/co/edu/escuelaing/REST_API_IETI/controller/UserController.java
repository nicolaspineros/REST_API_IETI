package co.edu.escuelaing.REST_API_IETI.controller;

import co.edu.escuelaing.REST_API_IETI.dto.UserDto;
import co.edu.escuelaing.REST_API_IETI.entities.User;
import co.edu.escuelaing.REST_API_IETI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById(@PathVariable String id ) {
        return new ResponseEntity<>(userService.findById(id),HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<User> create( @RequestBody UserDto userDto ) {
        User user = new User(userDto);
        return new ResponseEntity<>(userService.create(user),HttpStatus.CREATED);
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<?> update( @RequestBody UserDto user, @PathVariable String id ) {
        User userUp = userService.findById(id);
        return new ResponseEntity<>(userService.update(userUp,id),HttpStatus.OK);
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<?> delete( @PathVariable String id ) {
        return new ResponseEntity<>(userService.deleteById(id), HttpStatus.OK);
    }
}

