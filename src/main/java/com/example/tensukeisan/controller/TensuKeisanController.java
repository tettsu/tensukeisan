package com.example.tensukeisan.controller;

import com.example.tensukeisan.entity.AgariTehai;
import com.example.tensukeisan.enums.Kaze;
import com.example.tensukeisan.service.FuKeisanService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TensuKeisanController {

    private final FuKeisanService fuKeisanService;

    public TensuKeisanController(FuKeisanService fuKeisanService) {
        this.fuKeisanService = fuKeisanService;
    }

    @RequestMapping
    public int tensuKeisan(AgariTehai agariTehai,
                           Kaze bakaze,
                           Kaze jikaze) {
        return fuKeisanService.fuKeisan(agariTehai, bakaze, jikaze);
    }
}
