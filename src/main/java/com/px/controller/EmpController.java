package com.px.controller;

import com.px.entity.JsonResult;
import com.px.service.EmpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author EDZ
 */
@RestController
public class EmpController {
    @Resource
    private EmpService empService;
    @RequestMapping("/findAll.do")
    public JsonResult findAll(){
        JsonResult jsonResult = empService.findAll();
        return jsonResult;
    }
}
