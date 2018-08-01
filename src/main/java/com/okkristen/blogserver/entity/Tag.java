package com.okkristen.blogserver.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.okkristen.blogserver.common.entity.BaseEntity;
import org.hibernate.validator.constraints.NotBlank;


/**
 * 文章标签
 *
 * @author shimh
 * <p>
 * 2018年1月23日
 */
@Entity
@Table(name = "me_tag")
public class Tag extends BaseEntity {

    /**
     *
     */
    private static final long serialVersionUID = 5025313969040054182L;

    @NotBlank
    private String tagname;

    @NotBlank
    private String avatar;


    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }


}
