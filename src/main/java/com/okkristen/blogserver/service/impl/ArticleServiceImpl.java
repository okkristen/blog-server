package com.okkristen.blogserver.service.impl;

import com.okkristen.blogserver.DTO.ArticleDTO;
import com.okkristen.blogserver.common.service.CommonService;
import com.okkristen.blogserver.common.service.impl.CommonServiceImpl;
import com.okkristen.blogserver.entity.Article;
import com.okkristen.blogserver.service.ArticleService;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends CommonServiceImpl<Article, ArticleDTO> implements ArticleService {
}
