package co.edu.escuelaing.REST_API_IETI.service;

import co.edu.escuelaing.REST_API_IETI.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserServiceHashMap implements UserService{
    private final ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>();

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public User update(User user, String userId) {
        return null;
    }
}
