package com.buka.edu.controller;

import com.buka.edu.bean.Employee;
import com.buka.edu.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    EmpService service;











    @RequestMapping("save")
    public String saveEmp(Employee employee){
       //向数据库插入emp表插入  向用户角色中间表插入
        //我们逆行工程直接生成直接用  insert  要求传入对象
        service.addEmp(employee);
       //怎么拿到eid
        System.out.println("==="+employee);

//    重定向 向浏览器发送请求
    return "forward:/emp/getEmps";
    }




}
