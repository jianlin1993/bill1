package com.demo.bill1.filter;

import com.demo.bill1.controller.BillController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter" , urlPatterns = "/bill/*")
public class LoginFilter implements Filter {
    protected static Logger logger= LoggerFactory.getLogger(LoginFilter.class);
    public void destroy() {
        logger.info("过滤器销毁");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        logger.info("过滤器");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        logger.info("创建过滤器");
    }

}
