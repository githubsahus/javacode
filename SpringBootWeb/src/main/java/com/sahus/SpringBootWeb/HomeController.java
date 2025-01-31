package com.sahus.SpringBootWeb;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("in home");
        return "index.jsp";
    }


//    we can still simplify this code without using HttpServletRequest object as below
    /*@RequestMapping("/add")
    public String add(HttpServletRequest req, HttpSession session){
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        session.setAttribute("result", result);
        return "result.jsp";
    }*/


    /*@RequestMapping("add")
    public String add(int num1, int num2, HttpSession session){
        int result = num1 + num2;
        session.setAttribute("result", result);
        return "result.jsp";
    }*/

    //we can also get rid of session and use Model object
    /*@RequestMapping("add")
    public String add(int num1, int num2, Model model){
        int result = num1 + num2;
        model.addAttribute("result", result);
        return "result.jsp";
    }*/

    //we can use ModelAndView object to send data and view
    @RequestMapping("add")
    public ModelAndView add(int num1, int num2, ModelAndView mv){
        int result = num1 + num2;
        mv.addObject("result", result);
        mv.setViewName("result.jsp");
        return mv;
    }

    @RequestMapping("addAlien")
    public Alien addAlien(@ModelAttribute("alien") Alien alien){
        return alien;
    }
}
