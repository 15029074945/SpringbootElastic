package com.example.service.elasticsearch.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;

import java.util.Date;
import java.util.List;

/**
 * Created by liujx on 16/12/23.
 */
@Document(indexName = "springbootdb", type = "article", shards = 1, replicas = 0)
public class Article {
    @Id
    private String id;
    private String title;
    private String content;
    // @Field(type= FieldType.Nested)
    private List<Tag> tags;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd'T'HHmmss.SSS'Z'")
    @Field(type = FieldType.Date, format = DateFormat.basic_date_time, index = FieldIndex.not_analyzed)
    @CreatedDate
    private Date createdDateTime;

    public Date getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
