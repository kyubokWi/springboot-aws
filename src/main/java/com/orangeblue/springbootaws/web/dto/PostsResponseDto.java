package com.orangeblue.springbootaws.web.dto;

import com.orangeblue.springbootaws.domain.posts.Posts;

import lombok.Getter;

@Getter
public class PostsResponseDto {
    
    private Long id;
    private String title;
    private String author;
    private String content;
    

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.content = entity.getContent();
    }

}
