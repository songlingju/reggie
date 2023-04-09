package com.slj.reggie.test;

import com.slj.reggie.mapper.CategoryMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class MapperTest {

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    void a(){
        System.out.println(1);
    }


}
