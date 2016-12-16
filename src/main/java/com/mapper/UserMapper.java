package com.mapper;


import com.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2016/12/16.
 */
@Mapper
public interface UserMapper {
    @Select("SELECT id, name FROM user WHERE id = #{id}")
    User findById(@Param("id") Integer id);
}
