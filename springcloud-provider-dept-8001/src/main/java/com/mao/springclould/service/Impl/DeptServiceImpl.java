package com.mao.springclould.service.Impl;

import com.mao.springclould.dao.DeptDao;
import com.mao.springclould.pojo.Dept;
import com.mao.springclould.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mao
 * @createTime 2022/11/20 15:44
 * @Description: Dept服务层接口实现类，service高层调用dao低层
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Integer id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
