import cn.lz.mybatis.chapter2.Student;
import cn.lz.mybatis.chapter2.StudentMapper;
import cn.lz.mybatis.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by lizhaoz on 2016/3/18.
 */

public class StudentTest {
    @Test
    public void testFindAllStudents(){
        SqlSession sqlSession=MyBatisSqlSessionFactory.openSession();
        StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
        List<Student> students=studentMapper.findAllStudents();
        for (Student student:students){
            System.out.println(student);
        }
    }
}
