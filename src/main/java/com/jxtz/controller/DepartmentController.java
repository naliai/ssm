package com.jxtz.controller;

import com.jxtz.bean.Department;
import com.jxtz.bean.Msg;
import com.jxtz.dao.DepartmentMapper;
import com.jxtz.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 处理部门有关请求
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    //返回所有部门信息
    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts(){
        List<Department> list = departmentService.getDepts();
        return Msg.success().add("depts",list);
    }

}
