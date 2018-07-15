package com.okkristen.blogserver.entity;



import com.alibaba.fastjson.annotation.JSONField;
import com.okkristen.blogserver.common.entity.BaseEntity;

import javax.persistence.*;

/**
 * Created by beyondLi on 2017/7/25.
 */
@Entity
@Table(name = "student")
public class Student extends BaseEntity{


    @Column(name = "name")
    private String name;
    @JSONField(serialize=false)
    @Column(name = "age")
    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}