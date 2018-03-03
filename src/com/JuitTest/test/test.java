package com.JuitTest.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.mapper.StudentMapper;
import com.test.pojo.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class test {
	@Autowired
    private StudentMapper studentMapper;
 
    @Test
    public void testAdd() {
        Student student = new Student();
        student.setName("new Category");
        studentMapper.add(student);
    }
 
    @Test
    public void testList() {
        System.out.println(studentMapper);
        List<Student> cs=studentMapper.list();
        for (Student c : cs) {
            System.out.println(c.getName());
        }
    }
 
}
