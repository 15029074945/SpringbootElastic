package com.example.service.elasticsearch;

import com.example.service.elasticsearch.model.Article;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * Created by liujx on 16/12/23.
 */
public interface SearchArticleService {

    void init();
    Article save(Article post);
    Article findOne(String id);
    Iterable<Article> findAll();

    Page<Article> findByTagsName(String tagName, PageRequest pageRequest);

    List<Article> findByTitle(String title);
    Iterable<Article> search(QueryBuilder query, PageRequest pageRequest);
}
