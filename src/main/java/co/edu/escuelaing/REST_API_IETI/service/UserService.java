package co.edu.escuelaing.REST_API_IETI.service;

import co.edu.escuelaing.REST_API_IETI.entities.User;

import java.util.List;

public interface UserService
{
    User create( User user );

    User findById( String id );

    List<User> getAll();

    void deleteById( String id );

    User update(User user, String userId );
}
