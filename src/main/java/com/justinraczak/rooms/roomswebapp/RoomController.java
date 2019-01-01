package com.justinraczak.rooms.roomswebapp;

//  Created by Justin on 12/29/18

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    private RoomServices roomServices;

    @Autowired
    public RoomController(RoomServices roomServices) {
        super();
        this.roomServices = roomServices;
    }

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", this.roomServices.getAllRooms());
        return "rooms";
    }

    @GetMapping("/new")
    public ModelAndView showNewRoomForm(ModelAndView modelAndView) {
        Room room = new Room();
        modelAndView.setViewName("new_room");
        modelAndView.addObject("room", room);
        return modelAndView;
    }

    @PostMapping("/room")
    public String saveRoom(Room room) {
        roomServices.saveRoom(room);
        return "redirect:/rooms/" + room.getId();
    }

    @GetMapping("/{id}")
    public ModelAndView showRoom(ModelAndView modelAndView, @PathVariable Long id) {
        modelAndView.setViewName("show_room");
        Room room = roomServices.findRoomById(id);
        modelAndView.addObject("room", room);
        return modelAndView;
    }

}
