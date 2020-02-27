package com.example.demo.user;


import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/api/profile")
    public ResponseEntity<UserProfile> profile(){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        String email = user.getUsername() + "@MAILINATOR.COM";

        UserProfile profile = UserProfile.builder().name(user.getUsername()).email(email).build();

        return ResponseEntity.ok(profile);
    }
}
