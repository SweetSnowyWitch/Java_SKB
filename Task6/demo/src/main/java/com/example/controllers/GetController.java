package com.example.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctrlData")
public class GetController {
    private String ctrlData;

    @GetMapping
    public void setCtrlData(@RequestParam("ctrlData") String ctrlData)
    {
        this.ctrlData = ctrlData;
    } 

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    @ResponseBody
    public String getData(HttpServletRequest request, @RequestParam(value = "ID", defaultValue = "") String id) {
        return id;
    }

}
