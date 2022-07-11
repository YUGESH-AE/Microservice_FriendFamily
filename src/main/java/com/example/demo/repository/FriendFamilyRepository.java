package com.example.demo.repository;

import com.example.demo.entity.FriendFamily;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendFamilyRepository extends JpaRepository<FriendFamily,Integer> {

    FriendFamily findByPhoneNo(Long phoneNo);
}
