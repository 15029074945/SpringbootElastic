package com.example.service.elasticsearch.repository;

/**
 * Created by liujx on 16/12/23.
 */
import com.example.service.elasticsearch.model.Article;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;


public interface ArticleRepository extends ElasticsearchRepository<Article, String>{

    Page<Article> findByTagsName(String name, Pageable pageable);
    List<Article> findByTitle(String title);
    Iterable<Article> search(QueryBuilder query);

}
