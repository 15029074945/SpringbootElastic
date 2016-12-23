package com.example.repository;

/**
 * Created by liujx on 16/12/23.
 */
import com.example.model.Post;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface PostRepository extends ElasticsearchRepository<Post, String>{

    Page<Post> findByTagsName(String name, Pageable pageable);
    List<Post> findByTitle(String title);
    Iterable<Post> search(QueryBuilder query);

}
