package com.buka.edu.filter;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*

作用  将应用名绑定到 servlet上下文  用来再所有页面共享应用名
 */
public class ServletLister implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
      ServletContext sc= servletContextEvent.getServletContext();
        sc.setAttribute("root",sc.getContextPath());
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
