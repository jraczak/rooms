package com.justinraczak.rooms.roomswebapp;

//  Created by Justin on 12/29/18

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private RoomServices roomServices;

    @Autowired
    public RoomController(RoomServices roomServices) {
        super();
        this.roomServices = roomServices;
    }

    @GetMapping("/list")
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", this.roomServices.getAllRooms());
        return "rooms";
    }

}