package com.tanmoy.blogapp.controller;

import com.tanmoy.blogapp.domain.Blog;
import com.tanmoy.blogapp.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    BlogRepository blogRepository;

    @GetMapping("/home")
    public String homePage(Model model)
    {
        List<Blog> blogs = blogRepository.findAll();
        model.addAttribute("blogList",blogs);
        return "home";
    }

}
