package com.dode.cminternational.repository;

import com.dode.cminternational.model.NewsPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsPostRepository extends JpaRepository<NewsPost, Long> {
}