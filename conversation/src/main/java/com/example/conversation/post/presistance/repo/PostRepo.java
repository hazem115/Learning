package com.example.conversation.post.presistance.repo;

import com.example.conversation.post.presistance.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
}
