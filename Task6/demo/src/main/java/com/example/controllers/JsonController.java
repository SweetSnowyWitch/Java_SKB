package com.example.controllers;

import javax.servlet.http.HttpServletRequest;

import com.example.models.Item;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/json")
public class JsonController {

    @RequestMapping(method = RequestMethod.GET, value = "price/{price}/info/date/{date}")
    @ResponseBody
    public Item getData(HttpServletRequest request, @RequestParam(value = "id") int id,
            @RequestParam(value = "price") double price, @RequestParam(value = "date") double date) {
        var newItem = new Item();
        newItem.setDate(date);
        newItem.setPrice(price);
        newItem.setId(id);
        return newItem;
    }

}
