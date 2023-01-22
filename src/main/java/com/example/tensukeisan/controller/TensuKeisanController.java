package com.example.tensukeisan.controller;

import com.example.tensukeisan.entity.AgariTehai;
import com.example.tensukeisan.enums.Kaze;
import com.example.tensukeisan.service.FuKeisanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TensuKeisanController {

    @RequestMapping
    public double tensuKeisan(AgariTehai agariTehai,
                           Kaze bakaze,
                           Kaze jikaze) {
        return FuKeisanService.fuKeisan(agariTehai, bakaze, jikaze);
    }
}
