package com.dackdoo.test.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TimeMapper {

    @Select("select sysdate from dual")
    public String getTime();
    //XML ¹æ½Ä
    public String getTime2();
    
}