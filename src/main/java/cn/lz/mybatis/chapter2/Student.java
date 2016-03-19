package cn.lz.mybatis.chapter2;

import java.util.Date;

/**
 * Created by lizhaoz on 2016/3/18.
 */

public class Student
{
    private Integer studId;
    private String name;
    private String email;
    private Date dob;
    private PhoneNumber phoneNumber;
// setters and getters

    public Integer getStudId() {
        return studId;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", phoneNumber=" + phoneNumber.getAsString() +
                '}';
    }
}
