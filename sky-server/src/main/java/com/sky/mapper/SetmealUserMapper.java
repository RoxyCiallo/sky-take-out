package com.sky.mapper;

import com.sky.entity.Setmeal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealUserMapper {

    @Select("select * from setmeal where category_id = #{categoryId} and status = 1 order by create_time desc")
    List<Setmeal> listByCategoryId(Long categoryId);
}