package com.tsw.springboot.asynmethod;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl {
    // 查询文章
    public String selectArticle() {
        // TODO 模拟文章查询操作
        System.out.println("查询任务线程"+Thread.currentThread().getName());
        return "文章详情";
    }

    // 文章阅读量+1
    @Async("customExecutor")
    public void updateReadCount() {
        // TODO 模拟耗时操作
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("更新任务线程"+Thread.currentThread().getName());
    }
}
