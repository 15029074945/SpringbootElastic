package com.example.service;

import com.example.model.Post;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * Created by liujx on 16/12/23.
 */
public interface PostService {

    void init();
    Post save(Post post);
    Post findOne(String id);
    Iterable<Post> findAll();

    Page<Post> findByTagsName(String tagName, PageRequest pageRequest);

    List<Post> findByTitle(String title);
    Iterable<Post> search(QueryBuilder query, PageRequest pageRequest);
}
