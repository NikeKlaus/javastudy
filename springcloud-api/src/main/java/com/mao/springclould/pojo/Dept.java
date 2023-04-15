package com.mao.springclould.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author mao
 * @createTime 2022/10/15 18:00
 * @Description: 部门实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true) // 支持链式写法
public class Dept implements Serializable {
    private Integer id;
    private String name;
    private String source;
}
