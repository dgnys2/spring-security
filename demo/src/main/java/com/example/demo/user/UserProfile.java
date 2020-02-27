package com.example.demo.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class UserProfile {
    private String name;
    private String email;
}
