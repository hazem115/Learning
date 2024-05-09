package com.example.conversation.comment.presistance.repo;

import com.example.conversation.comment.presistance.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {

}
