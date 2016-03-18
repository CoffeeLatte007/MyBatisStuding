package cn.lz.mybatis.chapter2;

import java.util.List;

/**
 * Created by lizhaoz on 2016/3/18.
 */

public interface StudentMapper
{
    List<Student> findAllStudents();
    Student findStudentById(Integer id);
    void insertStudent(Student student);
}