package se.swmetric.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import se.swmetric.Repository.UserRepository;
import se.swmetric.entity.User;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao{
    final UserRepository userRepository;
    @Override
    public Integer getUserSize() {
        return Math.toIntExact(userRepository.count());
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
