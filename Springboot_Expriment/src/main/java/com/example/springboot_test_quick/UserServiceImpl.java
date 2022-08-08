package com.example.springboot_test_quick;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 实现接口的抽象方法
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserRepository userRepository;

    @Override
    public Result saveUser(User user) {
        User save = userRepository.save(user);
        return new Result(save);
    }

    @Override
    public Result queryAll() {
        List <User> list = userRepository.findAll();
        return new Result(list);
    }

    @Override
    public Result getByNameAndAge(String name, int age) {
        List <User> list = userRepository.getByNameAndAge(name, age);
        return new Result(list);
    }
}


