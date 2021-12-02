package com.ysh.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ScopeController {

    @RequestMapping("/testRequestByServiceAPI")
    public String testRequestByServiceAPI(HttpServletRequest httpServletRequest){
        httpServletRequest.setAttribute("testRequestScope","123");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("testRequestScope","modelAndView");
        //设置视图名称
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model){
        model.addAttribute("testRequestScope","model");
        System.out.println(model);
        return "success";
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("testRequestScope","map");
        System.out.println(map);
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap map){
        map.put("testRequestScope","ModelMap");
        System.out.println(map);
        return "success";
    }

    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope","session");
        return "success";
    }

    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){
        ServletContext application=session.getServletContext();
        application.setAttribute("testApplicationScope","application");
        return "success";
    }

}
