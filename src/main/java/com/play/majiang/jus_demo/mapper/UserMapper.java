package com.play.majiang.jus_demo.mapper;

import com.play.majiang.jus_demo.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * created by wm on 2019/10/10
 */

@Mapper
public interface UserMapper {
    @Insert("insert into user(name,account_id,token,gmt_create,gmt_modified,avatar_url) values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("Select * from user where token=#{token}")
    User findByToken(@Param("token") String token);

    @Select("Select * from user where id=#{id}")
    User findById(@Param("id") Integer id);
}
