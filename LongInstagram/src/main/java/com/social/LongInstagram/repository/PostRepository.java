package com.social.LongInstagram.repository;

import com.social.LongInstagram.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface PostRepository extends JpaRepository<Post ,Integer> {

     public List<Post>findByUserId(Integer userId);





}
