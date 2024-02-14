package com.blog.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.vo.Comment;

public interface CommentJpaRepository extends JpaRepository<Comment, Serializable>{

}
