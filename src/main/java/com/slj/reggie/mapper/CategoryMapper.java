package com.slj.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.slj.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {


}
