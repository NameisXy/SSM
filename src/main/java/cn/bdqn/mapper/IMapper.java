package cn.bdqn.mapper;

import cn.bdqn.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Mapper
public interface IMapper {
    /**
     * 根据账号密码登录
     * @param name
     * @param
     * @return
     */
    @Select("select name from login where name=#{name}")
    @Transactional
    String name(@Param("name") String name);

    @Select("select password from login where password=#{password}")
    String password(@Param("password") String password);

    //修改密码
    @Update("update login set password=#{password} where name=#{name1}")
    Integer ChangePassword(@Param("name1") String name1,@Param("password") String password);


}
