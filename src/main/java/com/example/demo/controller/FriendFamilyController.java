package com.example.demo.controller;

import com.example.demo.entity.FriendFamily;
import com.example.demo.service.FriendFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/friend")
public class FriendFamilyController {

    @Autowired
    FriendFamilyService friendFamilyService;

    @PostMapping("/insert")
    public FriendFamily insertFriend(@RequestBody FriendFamily friendFamily){
        friendFamilyService.insertFriend(friendFamily);
        FriendFamily friendFamily1=friendFamilyService.getFriend(friendFamily.getPhoneNo());
        return friendFamily1;
    }

    @GetMapping("/get/{phoneNo}")
    public FriendFamily getFriend(@PathVariable("phoneNo")Long phoneNo){
        return friendFamilyService.getFriend(phoneNo);
    }
}
