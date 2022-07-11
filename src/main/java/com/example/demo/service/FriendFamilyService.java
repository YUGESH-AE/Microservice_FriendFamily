package com.example.demo.service;

import com.example.demo.entity.FriendFamily;
import com.example.demo.repository.FriendFamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendFamilyService {

    @Autowired
    FriendFamilyRepository friendFamilyRepository;

    public void insertFriend(FriendFamily friendFamily){
        friendFamilyRepository.save(friendFamily);
    }

    public FriendFamily getFriend(Long phoneNo){
        return friendFamilyRepository.findByPhoneNo(phoneNo);
    }
}
