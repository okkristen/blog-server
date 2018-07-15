package com.okkristen.blogserver.dao.impl;



import com.okkristen.blogserver.common.dao.CommonRepository;
import com.okkristen.blogserver.common.dao.impl.CommonRepositoryImpl;
import com.okkristen.blogserver.dao.StudentRepository;
import com.okkristen.blogserver.entity.Student;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by beyondLi on 2017/7/25.
 */
@Repository
public  class StudentRepositoryImpl implements  StudentRepository{

////    springboot会默认自动将数据源中的配置注入,用法与hibernate中sessionFactory生成的session类似。以后使用多数据源时会详细解释
    @PersistenceContext
    EntityManager entityManager;
//
//    /**
//     *
//     * @return
//     */
    @Override
    public Student getStudent() {
        //编写jpql语句，进行执行回去所需数据
        List<Student> resultList = entityManager.createQuery("FROM Student")
                .setFirstResult(0)
                .setMaxResults(1)
                .getResultList();
        if (resultList.size() == 0) {
            return null;
        }
        return resultList.get(0);
    }
}