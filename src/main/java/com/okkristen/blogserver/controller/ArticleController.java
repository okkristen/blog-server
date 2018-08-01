package com.okkristen.blogserver.controller;


import com.okkristen.blogserver.common.Result.PageParam;
import com.okkristen.blogserver.common.Result.msg.AjaxResult;
import com.okkristen.blogserver.common.Result.msg.MessageCode;
import com.okkristen.blogserver.entity.Article;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping(value = "/articles")
public class ArticleController {


    @PostMapping("/findPage")
    public AjaxResult findPage(PageParam<Article> pageParam) {
        return  AjaxResult.createErrorResult(MessageCode.OPERATE_SUCCESS);
    }



}
