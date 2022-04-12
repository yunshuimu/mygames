package com.buka.edu.service;

import com.buka.edu.bean.Employee;
import com.buka.edu.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
    @Autowired
    EmployeeMapper mapper;


    public void addEmp(Employee employee) {
        mapper.insertSelective(employee);
    }





    public Employee getOneByNameAndPw(String getuName, String getuPassword) {
        //查的是权限也应该带着
        return mapper.selectByNameAndPw(getuName,getuPassword);







    }
}
