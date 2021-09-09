package com.zky.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestNumController implements Controller {   //导mvc 包

    //controller 中有个 方法 叫做   模型和试图  意思 是把 试图和模型绑定到一起了

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        System.out.println("我是模型和试图");
        System.out.println("注意要写的和前端的试图名称一样");
        ModelAndView modelAndView = new ModelAndView("test02");
        return modelAndView;
    }
}
