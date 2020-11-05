package com.example.myswaggertomacdowndemo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户实体类")
@Data
public class User {
    @ApiModelProperty("用户姓名")
    private String name;
    @ApiModelProperty("用户年龄")
    private int age;
    @ApiModelProperty("用户出生日期")
    private String birthDay;
    @ApiModelProperty("用户id")
    private int id;
}
