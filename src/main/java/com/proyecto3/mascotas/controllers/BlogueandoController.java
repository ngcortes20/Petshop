package com.proyecto3.mascotas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/blogueando")
public class BlogueandoController {
    
    @GetMapping("")
    public String blogueando(@RequestParam(value="blog", required = false)String blog) {
        
        return blog == null ? "blogueando.jsp" : "blogs/"+ blog + ".jsp"; 
        //return "blogs/accesorios.jsp";
    }
}
