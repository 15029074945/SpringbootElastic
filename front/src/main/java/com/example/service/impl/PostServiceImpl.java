package com.example.service.impl;

import com.example.model.Post;
import com.example.model.Tag;
import com.example.repository.PostRepository;
import com.example.service.PostService;
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
public class PostServiceImpl implements PostService {

//    @Autowired
//    private PostRepository postRepository;
//
//    @Override
//    public Post save(Post post) {
//        postRepository.save(post);
//        return post;
//    }
//
//    @Override
//    public Post findOne(String id) {
//        return postRepository.findOne(id);
//    }
//
//    @Override
//    public Iterable<Post> findAll() {
//        return postRepository.findAll();
//    }
//
//    @Override
//    public Page<Post> findByTagsName(String tagName, PageRequest pageRequest) {
//        return postRepository.findByTagsName(tagName, pageRequest);
//    }
//
//    public void init(){
//        for (int i = 0; i < 100; i++) {
//            Post post = new Post();
//            post.setId(i+"");
//            post.setTitle(i + ".刘纪翔单元测试用例");
//            Tag tag = new Tag();
//            tag.getId();
//            tag.setId(i+"");
//            tag.setName("test tag");
//            post.setContent("梁桂钊单元测试用例"+i+"xxxxx");
//            post.setCreatedDateTime(new Date());
//            this.postRepository.save(post);
//        }
//    }
//
//    public Iterable<Post> search(QueryBuilder query, PageRequest pageRequest){
//        return postRepository.search(query, pageRequest);
//    }
//
//    public List<Post> findByTitle(String title) {
//        return this.postRepository.findByTitle(title);
//    }

}
