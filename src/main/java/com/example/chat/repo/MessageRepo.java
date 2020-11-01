package com.example.chat.repo;


import com.example.chat.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
