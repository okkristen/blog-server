package com.okkristen.blogserver.entity;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.okkristen.blogserver.common.entity.BaseEntity;
import org.hibernate.validator.constraints.NotBlank;


/**
 * 文章分类
 *
 * @author shimh
 * <p>
 * 2018年1月23日
 */
@Entity
@Table(name = "me_category")
public class Category extends BaseEntity {

    /**
     *
     */
    private static final long serialVersionUID = 5025313969040054182L;

    @NotBlank
    private String categoryname;

    private String description;

    @NotBlank
    private String avatar;


    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
