package com.tanmoy.blogapp.repository;

import com.tanmoy.blogapp.domain.Blog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogRepository extends JpaRepository<Blog,Long> {

}
