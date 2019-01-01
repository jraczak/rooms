package com.justinraczak.rooms.roomswebapp;

//  Created by Justin on 12/29/18

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServices {
    private RoomRepository roomRepository;

    @Autowired
    public RoomServices(RoomRepository roomRepository) {
        super();
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        List<Room> rooms = new ArrayList<>();
        this.roomRepository.findAll().forEach(rooms::add);
        return rooms;
    }

    public Room saveRoom(Room room) {
        roomRepository.save(room);
        return room;
    }

    //TODO: Handle room-not-found error
    public Room findRoomById(Long id) {
        return roomRepository.findRoomById(id);
    }
}
