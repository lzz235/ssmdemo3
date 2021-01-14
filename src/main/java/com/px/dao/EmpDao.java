package com.px.dao;

import com.px.entity.Emp;

import java.util.List;

/**
 * @author EDZ
 */
public interface EmpDao {
    /**
     * 查询所有员工信息
     * @return
     */
    List<Emp> findAll();
}
