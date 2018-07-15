package com.okkristen.blogserver.controller;





import com.okkristen.blogserver.entity.Student;
import com.okkristen.blogserver.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by beyondLi on 2017/7/25.
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    private Logger logger = Logger.getLogger(this.getClass());

    @Resource
    StudentService studentService;


    @PostMapping(value = "/getInfo")
    public Student getInfo() {
        logger.debug("ceeceec");
        return studentService.getStudent();
    }

    // 还未成功
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
        map.put("hello","from TemplateController.helloHtml");
        return"/Hello";
    }
}
