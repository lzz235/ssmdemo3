package com.px.service;

import com.px.entity.Emp;
import com.px.entity.JsonResult;

import java.util.List;

/**
 * @author EDZ
 */
public interface EmpService {
    /**
     * 查询所有员工信息
     * @return 返回jsonresult包括状态、信息、数据
     */
    JsonResult findAll();
}
