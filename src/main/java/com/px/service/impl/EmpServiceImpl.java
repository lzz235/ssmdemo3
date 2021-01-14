package com.px.service.impl;

import com.px.dao.EmpDao;
import com.px.entity.Emp;
import com.px.entity.JsonResult;
import com.px.service.EmpService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author EDZ
 */
@Service
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpDao empDao;
    @Override
    public JsonResult findAll() {
        List<Emp> emps = empDao.findAll();
        JsonResult jsonResult = new JsonResult();
        jsonResult.setStatus(0);
        jsonResult.setMsg("成功查询");
        jsonResult.setData(emps);
        return jsonResult;
    }
}
