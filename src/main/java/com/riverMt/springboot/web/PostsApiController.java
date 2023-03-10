package com.riverMt.springboot.web;

import com.riverMt.springboot.service.posts.PostsService;
import com.riverMt.springboot.web.dto.PostsResponseDto;
import com.riverMt.springboot.web.dto.PostsSaveRequestDto;
import com.riverMt.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }

    @GetMapping("api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id, @RequestBody PostsResponseDto responseDto) {
        return postsService.findById(id);
    }

}
