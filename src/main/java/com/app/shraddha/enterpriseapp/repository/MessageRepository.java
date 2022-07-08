package com.app.shraddha.enterpriseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.shraddha.enterpriseapp.model.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer>{

}
