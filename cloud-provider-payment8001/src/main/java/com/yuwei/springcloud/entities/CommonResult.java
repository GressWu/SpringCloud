package com.yuwei.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> { //创建一个范形接收器
    private Integer code; //码值
    private String message;//信息
    private T data; //传入的实体类
    public  CommonResult(Integer code,String message){
        this(code,message,null);      //如果没有实体类传入调用该有参构造
    }
}
