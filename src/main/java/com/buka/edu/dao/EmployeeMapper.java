package com.buka.edu.dao;

import com.buka.edu.bean.Employee;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {

    int insert(Employee record);
    int insertSelective(Employee record);
    Employee selectByNameAndPw(@Param("uName") String getuName, @Param("uPassword") String getuPassword);
}