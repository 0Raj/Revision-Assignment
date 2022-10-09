package com.masai.blog.repository;

import com.masai.blog.module.Post;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostSortAndPagination extends PagingAndSortingRepository<Post,Integer> {
}
