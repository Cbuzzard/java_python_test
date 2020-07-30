package com.buzzardsview.readit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;

@Controller
public class RunnerController {

    @GetMapping
    @ResponseBody
    public String runner() {
        String command = "python src\\python\\main.py";
        try {
            Process p = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "test";
    }

}
