package org.dubbo.api.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.dubbo.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

	@Select("select * from user where id = #{id}")
	User findById(@Param("id") int id);

}
