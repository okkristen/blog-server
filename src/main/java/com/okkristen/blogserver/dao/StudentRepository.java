package com.okkristen.blogserver.dao;


import com.okkristen.blogserver.common.dao.CommonRepository;
import com.okkristen.blogserver.entity.Student;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 * Created by beyondLi on 2017/7/25.
 */
public interface StudentRepository  {
    /**
     * 获取一个同学的信息
     * @return
     */
    Student getStudent();
}