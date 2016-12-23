package com.example.service.elasticsearch.impl;


import com.example.service.elasticsearch.SearchArticleService;
import com.example.service.elasticsearch.model.Article;
import com.example.service.elasticsearch.model.Tag;
import com.example.service.elasticsearch.repository.ArticleRepository;
import org.elasticsearch.index.query.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by liujx on 16/12/23.
 */
@Service
public class SearchArticeServiceImpl implements SearchArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article save(Article post) {
        articleRepository.save(post);
        return post;
    }

    @Override
    public Article findOne(String id) {
        return articleRepository.findOne(id);
    }

    @Override
    public Iterable<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public Page<Article> findByTagsName(String tagName, PageRequest pageRequest) {
        return articleRepository.findByTagsName(tagName, pageRequest);
    }

    public void init(){
        for (int i = 0; i < 100; i++) {
            Article post = new Article();
            post.setId(i+"");
            post.setTitle(i + ".单元测试用例");
            Tag tag = new Tag();
            tag.getId();
            tag.setId(i+"");
            tag.setName("test tag");
            post.setContent("单元测试用例Content===="+i+"====");
            post.setCreatedDateTime(new Date());
            this.articleRepository.save(post);
        }
    }

    public Iterable<Article> search(QueryBuilder query, PageRequest pageRequest){
        return articleRepository.search(query, pageRequest);
    }

    public List<Article> findByTitle(String title) {
        return this.articleRepository.findByTitle(title);
    }
}
