package com.buka.edu.controller;

import com.buka.edu.bean.Employee;
import com.buka.edu.service.EmpService;
import com.buka.edu.util.RandomValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class LoginController {
    @Autowired
    EmpService service;

    @RequestMapping("/login")
    public String login(Employee employee, String code, HttpServletRequest request, HttpServletResponse response){
     System.out.println("---------"+code);
    request.removeAttribute("message");
    String chose=request.getParameter("chose");
        String color=request.getParameter("color");
           if(code!=""){
               //从session中那大正确的验证码 去比较
               HttpSession session=request.getSession();
               String reaCode=(String) session.getAttribute(RandomValidateCode.RANDOMCODEKEY);
                if(reaCode.equalsIgnoreCase(code)){
                    //验证码正确的
                    //我们再来判断用户名密码对不对
                     Employee employee1= service.getOneByNameAndPw(employee.getuName(),employee.getuPassword());
                    System.out.println(employee1);

                    if(employee1==null){
                        //提示用户名或者密码错误
                        request.setAttribute("message","用户名或者密码错误");
                        try {
                            request.getRequestDispatcher("/login.jsp").forward(request,response);
                        } catch (ServletException e) {
                            e.printStackTrace();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }else{
                        //跳转到主页面/list
                        //登录成功的时候需要把 //放到session中
                        HttpSession session1=request.getSession();
                        session1.setAttribute("loginemp",employee1);

                       String path= request.getContextPath();


                            if("0".equals(chose)){
                                if("hong".equals(color)){
                                    try {
                                        response.sendRedirect(path+"/index2hong.html");
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }else if ("zi".equals(color)){
                                    try {
                                        response.sendRedirect(path+"/index2zi.html");
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }else{
                                    try {
                                        response.sendRedirect(path+"/index2huang.html");
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }




                            }else if("1".equals(chose)){
                                if("hong".equals(color)){
                                    try {
                                        response.sendRedirect(path+"/index1hong.html");
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }else if ("zi".equals(color)){
                                    try {
                                        response.sendRedirect(path+"/index1zi.html");
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }else{
                                    try {
                                        response.sendRedirect(path+"/index1.html");
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }



                            }else if("2".equals(chose)){
                                if("hong".equals(color)){
                                    try {
                                        response.sendRedirect(path+"/indexhong.html");
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }else if ("zi".equals(color)){
                                    try {
                                        response.sendRedirect(path+"/indexzi.html");
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }else{
                                    try {
                                        response.sendRedirect(path+"/index.html");
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }


                            }







                    }






                }else{
                    //给页面返回数据验证码错误
                    request.setAttribute("message","验证码错误");
                    try {
                        request.getRequestDispatcher("/login.jsp").forward(request,response);
                    } catch (ServletException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
           }else{
               request.setAttribute("message","验证码不能为空");
               try {
                   request.getRequestDispatcher("/login.jsp").forward(request,response);
               } catch (ServletException e) {
                   e.printStackTrace();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }

        return null;
    }
    @RequestMapping("/zhuce")
    public void zhuce(Employee employee, String code, HttpServletRequest request, HttpServletResponse response){

        service.addEmp(employee);
String path=request.getContextPath();
        try {
            response.sendRedirect(path+"/login.jsp");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @RequestMapping("/chose")
    public void chose(String chose,HttpServletRequest request,HttpServletResponse response){
       String path=request.getContextPath();

    }
}
