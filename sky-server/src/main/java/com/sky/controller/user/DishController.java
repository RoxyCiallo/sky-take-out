package com.sky.controller.user;

import com.sky.entity.Dish;
import com.sky.result.Result;
import com.sky.service.DishService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("userDishController")
@RequestMapping("/user/dish")
@Api(tags = "user dish")
public class DishController {

    @Autowired
    private DishService dishService;

    @GetMapping("/list")
    @ApiOperation("query dish list")
    public Result<List<Dish>> list(Long categoryId) {
        return Result.success(dishService.list(categoryId));
    }
}