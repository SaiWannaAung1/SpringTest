package com.example.demo.service.impl;

import com.example.demo.dao.UserJpaRepository;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserJpaRepository userJpaRepsitory;


    @Override
    public void save(UserDto dto) {
        User user = dto.getEntity();
        this.userJpaRepsitory.save(user);
    }

    @Override
    public void deleteById(Long id) {

    }


}
