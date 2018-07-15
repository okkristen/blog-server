package com.okkristen.blogserver.config.MVC;


import org.apache.shiro.web.servlet.OncePerRequestFilter;
import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 */
//
@Component
public class CrossDomainFilter extends OncePerRequestFilter {

    static final String ORIGIN = "Origin";

    @Override
    protected void doFilterInternal(ServletRequest req, ServletResponse res, FilterChain chain) throws ServletException, IOException {
        HttpServletResponse response = (HttpServletResponse)res;
        HttpServletRequest reqs = (HttpServletRequest)req;
        response.setHeader("Access-Control-Allow-Origin", reqs.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type,X-Authorization");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        // 异步请求
        req.setAttribute("org.apache.catalina.ASYNC_SUPPORTED", true);
        System.out.println("*********************************过滤器被使用**************************");
        chain.doFilter(req, res);
    }
}
