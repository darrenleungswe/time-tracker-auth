package swe.darrenleung.timetrackerauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swe.darrenleung.timetrackerauth.entity.User;
import swe.darrenleung.timetrackerauth.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

}
