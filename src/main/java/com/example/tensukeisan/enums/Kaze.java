package com.example.tensukeisan.enums;

public enum Kaze {

    EAST("東"),
    WEST("西"),
    SOUTH("南"),
    NORTH("北");

    private final String kazeString;

    private Kaze(String kazeString) {
        this.kazeString = kazeString;
    }

    public String getKazeString() {
        return this.kazeString;
    }

}
