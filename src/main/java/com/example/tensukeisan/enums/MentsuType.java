package com.example.tensukeisan.enums;

public enum MentsuType {

    SHUNTSU("順子"),
    ANKO("暗刻"),
    MINKO("明刻"),
    ANKANTSU("暗槓子"),
    MINKANTSU("明槓子");

    private final String mentsuTypeString;

    MentsuType(String mentsuTypeString) {
        this.mentsuTypeString = mentsuTypeString;
    }

    public String getMentsuTypeString() {
        return mentsuTypeString;
    }

}
