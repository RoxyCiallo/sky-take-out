package com.sky.controller.user;

import com.sky.entity.Setmeal;
import com.sky.mapper.SetmealUserMapper;
import com.sky.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("userSetmealController")
@RequestMapping("/user/setmeal")
@Api(tags = "user setmeal")
public class SetmealController {

    @Autowired
    private SetmealUserMapper setmealUserMapper;

    @GetMapping("/list")
    @ApiOperation("query setmeal list")
    public Result<List<Setmeal>> list(Long categoryId) {
        return Result.success(setmealUserMapper.listByCategoryId(categoryId));
    }
}