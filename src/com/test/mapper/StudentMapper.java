package com.test.mapper;

import java.util.List;

import com.test.pojo.Student;

public interface StudentMapper {
	public int add(Student student); 
    
    public void delete(int id); 
        
    public Student get(int id); 
      
    public int update(Student category);  
        
    public List<Student> list();
     
    public int count();  
}
