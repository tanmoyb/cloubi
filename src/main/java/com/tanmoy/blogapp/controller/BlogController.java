package com.tanmoy.blogapp.controller;

import com.tanmoy.blogapp.domain.Blog;
import com.tanmoy.blogapp.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class BlogController {

    @Autowired
    BlogRepository blogRepository;


    @GetMapping(value = "/addblog")
    public String registration(Model model) {
        model.addAttribute(new Blog());
        return "addBlog";
    }

    @PostMapping(value = "/addblog")
    public String doRegistration(@ModelAttribute("blog") Blog blog, Model model) {
        blog.setDate(new Date());
        blogRepository.save(blog);
        return "redirect:/home";
    }

    @RequestMapping(value = "/deleteblog", method = RequestMethod.GET)
    public String deleteStudent(@RequestParam(name = "id") Long id) {
        blogRepository.deleteById(id);
        return "redirect:/home";
    }


}
