package com.mao.springclould.service;

import com.mao.springclould.dao.DeptDao;
import com.mao.springclould.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author mao
 * @createTime 2022/11/20 15:43
 * @Description: Dept服务层接口
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Integer id);

    public List<Dept> queryAll();
}
