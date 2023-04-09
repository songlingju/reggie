package com.slj.reggie.dto;

import com.slj.reggie.entity.Setmeal;
import com.slj.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
