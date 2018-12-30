package com.justinraczak.rooms.roomswebapp;

//  Created by Justin on 12/29/18

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room,Long>{
}
