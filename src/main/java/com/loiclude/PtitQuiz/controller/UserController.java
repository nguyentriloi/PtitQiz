package com.loiclude.PtitQuiz.controller;

import com.loiclude.PtitQuiz.model.User;
import com.loiclude.PtitQuiz.response.PtitResponse;
import com.loiclude.PtitQuiz.service.user.UserService;
import com.loiclude.PtitQuiz.service.user.beans.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("login")
    public PtitResponse login(@RequestBody UserRequest userRequest){
        return userService.login(userRequest);
    }
}
