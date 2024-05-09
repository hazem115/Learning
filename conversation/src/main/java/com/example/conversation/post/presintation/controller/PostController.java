package com.example.conversation.post.presintation.controller;

import com.example.conversation.post.presistance.entity.Post;
import com.example.conversation.post.presistance.repo.PostRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    PostRepo postRepo;
    @GetMapping
    List<Post> getPosts(){
        return postRepo.findAll();
    }

    @PostMapping
    Post createPost(@RequestBody Post post){
        return postRepo.save(post);
    }
}
