package cn.bdqn.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IbillMapper {

    @Select("insert into bill(address,kg,telephon) values(#{address},#{kg},#{telephon})")
    Integer order(@Param("address") String address,@Param("kg") Integer kg,@Param("telephon") String telephon);
}
