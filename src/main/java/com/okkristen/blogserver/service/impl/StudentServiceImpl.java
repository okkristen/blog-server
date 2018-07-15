package com.okkristen.blogserver.service.impl;

import com.okkristen.blogserver.dao.StudentRepository;
import com.okkristen.blogserver.entity.Student;
import com.okkristen.blogserver.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Iterator;

/**
 * Created by beyondLi on 2017/7/25.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    /**
     *
     * @return
     */
    @Override
    @Transactional
    public Student getStudent() {
//      Iterable<Student> iterable =  studentRepository.findAll();
//     Iterator<Student> i =  iterable.iterator();
//     while (i.hasNext()){
//         System.out.println(i.next());
//     }
        return studentRepository.getStudent();
    }
}