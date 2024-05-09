package com.example.conversation.comment.presintation.controller;

import com.example.conversation.comment.presistance.entity.Comment;
import com.example.conversation.comment.presistance.repo.CommentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    CommentRepo commentRepo;
    @GetMapping
    List<Comment> getComments(){
        return commentRepo.findAll();
    }

    @PostMapping
    Comment createComment(@RequestBody Comment comment){
        return commentRepo.save(comment);
    }
}
