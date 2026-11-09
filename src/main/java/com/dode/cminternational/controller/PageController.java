package com.dode.cminternational.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/work-area")
    public String workArea() {
        return "work-area";
    }

    @GetMapping("/workspaces")
    public String workspaces() {
        return "workspaces";
    }

    @GetMapping("/health-center")
    public String healthCenter()
    {
        return "health-center";
    }

    @GetMapping("/pokot-project")
    public String pokotProject() {
        return "pokot-project";
    }

    @GetMapping("/team")
    public String team() {
        return "team";
    }

    @GetMapping("/login")
    public String login() { return "login"; }
}