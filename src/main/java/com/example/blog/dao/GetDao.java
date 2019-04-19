package com.example.blog.dao;

import com.example.blog.pojo.News;
import com.example.blog.pojo.Tags;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public interface GetDao {
    List<Tags> query(String tag);

    List<String> queryTags(String newsid);

    News queryNews(String newsid);
    List<News> queryAll();
}
