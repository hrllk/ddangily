package com.rnj.ddangily.service;

import com.rnj.ddangily.entity.Instagram;

import java.util.List;
import java.util.Optional;

public interface InstagramService {

    void updatePosts();

    Optional<List<Instagram>> getPosts();
}
