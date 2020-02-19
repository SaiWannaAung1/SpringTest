package com.example.demo.controller;

import com.example.demo.dao.UserJpaRepository;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserJpaRepository userJpaRepository;
    @Autowired
    UserService userService;
    @GetMapping("/newUser")
    public String index(Model model)
    {
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "user/new";
    }

    @PostMapping("/newUser")
    public String createUser(UserDto user){
            this.userService.save(user);
            System.out.println("Name "+ user.getName());
            System.out.println("Email "+ user.getEmail());
            return "redirect:/user/newUser";

    }

}
