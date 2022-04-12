package com.buka.edu.filter;

import com.buka.edu.bean.Employee;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginRoleFilter implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //从session中 看看是否有 登录的对象
      Employee employee=(Employee) request.getSession().getAttribute("loginemp");
      if(employee==null){
          //没有登录郭  转发到login.jsp
          request.setAttribute("loginMessage","请登录");
          request.getRequestDispatcher("/login.jsp").forward(request,response);

      }
      return  true;

    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
