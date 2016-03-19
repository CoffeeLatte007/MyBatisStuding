package cn.lz.mybatis.util;

import cn.lz.mybatis.chapter2.PhoneNumber;
import cn.lz.mybatis.chapter2.Student;
import cn.lz.mybatis.chapter2.StudentMapper;
import cn.lz.mybatis.typehandlers.typehandlers;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;


/**
 * Created by lizhaoz on 2016/3/19.
 */

public class MyJavaApiSqlSessionFactory {
    private static SqlSessionFactory sqlSessionFactory;
    public static SqlSessionFactory getSqlSessionFactory(){
        if (sqlSessionFactory==null){
            synchronized (MyBatisSqlSessionFactory.class){
                if (sqlSessionFactory==null){
                    DataSource dataSource= DataSourceFactory.getDataSource();//得到数据连接池
                    TransactionFactory transactionFactory=new JdbcTransactionFactory();//创建一个事务
                    Environment environment=new Environment("development",transactionFactory,dataSource);//创建一个环境
                    Configuration configuration=new Configuration(environment);
                    configuration.getTypeAliasRegistry().registerAlias("student", Student.class);//注册别名
                    configuration.getTypeHandlerRegistry().register(PhoneNumber.class,typehandlers.class);
                    configuration.addMapper(StudentMapper.class);
                    sqlSessionFactory=new SqlSessionFactoryBuilder().build(configuration);
                }
            }
        }
        return sqlSessionFactory;
    }
}
