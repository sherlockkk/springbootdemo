package com.sherlockkk.mybatisannotation.mapper;

import com.sherlockkk.mybatisannotation.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

  @Select("select * from tb_user where id = #{id}")
  User findOne(long id);

}
