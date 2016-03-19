package cn.lz.mybatis.typehandlers;

import cn.lz.mybatis.chapter2.PhoneNumber;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lizhaoz on 2016/3/19.
 */
public class typehandlers extends BaseTypeHandler<PhoneNumber>{
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, PhoneNumber phoneNumber, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i,phoneNumber.getAsString());
    }

    @Override
    public PhoneNumber getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return new PhoneNumber(resultSet.getString(s));
    }

    @Override
    public PhoneNumber getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return new PhoneNumber(resultSet.getString(i));
    }

    @Override
    public PhoneNumber getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return new PhoneNumber(callableStatement.getString(i));
    }
}
