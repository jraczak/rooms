package com.justinraczak.rooms.roomswebapp;

//  Created by Justin on 12/29/18

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }
}
