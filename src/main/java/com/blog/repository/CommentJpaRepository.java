package com.blog.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.blog.vo.Comment;

public interface CommentJpaRepository extends JpaRepository<Comment, Serializable>{
	List<Comment> findAllByPostId(Long postId);

	List<Comment> findAllByPostIdOrderByRegDateDesc(Long postId);
	
	Comment findById(Long id);
	
	@Query("SELECT c FROM Comment c WHERE c.postId = :postId AND c.comment LIKE %:query%")
    List<Comment> searchComments(@Param("postId") Long postId, @Param("query") String query);

}
