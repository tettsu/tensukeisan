package com.example.tensukeisan.entity;

import com.example.tensukeisan.enums.HaiType;
import lombok.Data;

@Data
public class Hai {

    private String haiName;

    private HaiType haiType;

    private Integer haiNumber;

    private boolean isYaochu;

    public Hai(String haiName, HaiType haiType, Integer haiNumber, boolean isYaochu) {
        this.haiName = haiName;
        this.haiType = haiType;
        this.haiNumber = haiNumber;
        this.isYaochu = isYaochu;
    }

}
