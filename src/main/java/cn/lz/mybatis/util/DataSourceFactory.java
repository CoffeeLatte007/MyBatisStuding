package cn.lz.mybatis.util;

import org.apache.ibatis.datasource.pooled.PooledDataSource;

import javax.sql.DataSource;


/**
 * Created by lizhaoz on 2016/3/19.
 */

public class DataSourceFactory {
    public static DataSource getDataSource(){
        String drive="com.mysql.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/mybatis";
        String username="root";
        String password="123";
        PooledDataSource pooledDataSource=new PooledDataSource(drive,url,username,password);
        return  pooledDataSource;
    }
}
