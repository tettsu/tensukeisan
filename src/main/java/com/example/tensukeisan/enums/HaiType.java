package com.example.tensukeisan.enums;

public enum HaiType {

    MANZU("萬子"),
    PINZU("筒子"),
    SOZU("索子"),
    JIHAI("字牌");

    private final String haiTypeString;

    HaiType(String haiTypeString) {
        this.haiTypeString = haiTypeString;
    }

    public String getHaiTypeString() {
        return this.haiTypeString;
    }

}
