package com.okkristen.blogserver.DTO;


import com.alibaba.fastjson.annotation.JSONField;
import com.okkristen.blogserver.common.dto.BaseDTO;
import com.okkristen.blogserver.common.entity.BaseEntity;
import com.okkristen.blogserver.entity.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

/**
 * 文章
 *
 * @author okkristen
 * <p>
 * 2018年1月23日
 */

public class ArticleDTO extends BaseDTO {

    public static final int Article_TOP = 1;

    public static final int Article_Common = 0;

    /**
     *
     */
    private static final long serialVersionUID = -4470366380115322213L;

    private String title;

    private String summary;


    private User author;

    private ArticleBody body;


    private Category category;

    private List<Tag> tags;

    private List<Comment> comments;

    private int commentCounts;

    private int viewCounts;

    /**
     * 置顶
     */
    private int weight = Article_Common;


    /**
     * 创建时间
     */
    private Date createDate;


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getSummary() {
        return summary;
    }


    public void setSummary(String summary) {
        this.summary = summary;
    }


    public User getAuthor() {
        return author;
    }


    public void setAuthor(User author) {
        this.author = author;
    }


    public ArticleBody getBody() {
        return body;
    }


    public void setBody(ArticleBody body) {
        this.body = body;
    }


    public Category getCategory() {
        return category;
    }


    public void setCategory(Category category) {
        this.category = category;
    }


    public List<Tag> getTags() {
        return tags;
    }


    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


    public List<Comment> getComments() {
        return comments;
    }


    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }


    public int getCommentCounts() {
        return commentCounts;
    }


    public void setCommentCounts(int commentCounts) {
        this.commentCounts = commentCounts;
    }


    public int getViewCounts() {
        return viewCounts;
    }


    public void setViewCounts(int viewCounts) {
        this.viewCounts = viewCounts;
    }


    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }


    public Date getCreateDate() {
        return createDate;
    }


    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


}
