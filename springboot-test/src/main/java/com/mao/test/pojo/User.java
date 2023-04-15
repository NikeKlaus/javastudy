package com.mao.test.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author mao
 * @createTime 2022/12/11 20:34
 * @Description: User实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//@TableName("user")
public class User {
    @TableId(type = IdType.AUTO,value = "ID")
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;
    @Version
    private Integer version;
    @TableLogic
    private Integer deleted;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
