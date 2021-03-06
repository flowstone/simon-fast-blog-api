package me.xueyao.controller;

import me.xueyao.base.R;
import me.xueyao.entity.dto.LoginDto;
import me.xueyao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Simon.Xue
 * @date 1/28/21 2:50 PM
 **/
@RestController
public class LoginController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public R login(@RequestBody LoginDto loginDto) {
        return userService.login(loginDto);
    }

    @GetMapping("/currentUser/{id}")
    public R currentUser(@PathVariable("id") Integer id) {
        return userService.currentUser(id);
    }
}
