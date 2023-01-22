package com.example.tensukeisan.enums;

public enum MachiType {

    RYANMEN("両面"),
    KANCHAN("嵌張"),
    PENCHAN("辺張"),
    SHANPON("双碰"),
    TANKI("単騎");

    private String machiTypeString;

    MachiType(String machiTypeString) {
        this.machiTypeString = machiTypeString;
    }

}
