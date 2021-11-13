package com.tsw.springboot.asynmethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsynTestController {
    @Autowired
    private ArticleServiceImpl articleService;

    /**
     * 模拟获取文章后阅读量+1
     */
    @PostMapping("/article")
    public String getArticle() {
        // 查询文章
        String article = articleService.selectArticle();
        // 阅读量+1
        articleService.updateReadCount();
        System.out.println("文章阅读业务执行完毕");
        return article;
    }
}
