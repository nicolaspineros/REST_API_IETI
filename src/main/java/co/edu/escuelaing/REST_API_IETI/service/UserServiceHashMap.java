package co.edu.escuelaing.REST_API_IETI.service;

import co.edu.escuelaing.REST_API_IETI.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserServiceHashMap implements UserService{
    private final ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>();

    @Override
    public User create(User user) {
        return users.put(user.getId(), user);
    }

    @Override
    public User findById(String id) {
        return users.get(id);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<User>(users.values());
    }

    @Override
    public User deleteById(String id) {
        return users.remove(id);
    }

    @Override
    public User update(User user, String userId) {
        users.replace(userId,user);
        return users.get(userId);
    }
}
