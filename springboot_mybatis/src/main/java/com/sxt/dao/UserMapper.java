package com.sxt.dao;

import com.sxt.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
//@Mapper
public interface UserMapper {

//    @Delete("delete from sys_user where id=#{id}")
    int deleteByPrimaryKey(Integer id);

//    @Insert("insert into sys_user (name,address,birth)values(#{name},#{address},#birth)")
    int insert(User record);

//    @Select("select * from sys_user where id =#{id}")
    User selectByPrimaryKey(Integer id);

//    @Select("select * from sys_user")
    List<User> selectAll();

//    @Update("update sys_user set name=#{name},address=#{address},birth=#{birth} where id =#{id}")
    int updateByPrimaryKey(User record);
}