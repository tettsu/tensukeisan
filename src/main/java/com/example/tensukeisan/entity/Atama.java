package com.example.tensukeisan.entity;

import lombok.Data;

@Data
public class Atama {

    private Hai hai1;

    private Hai hai2;

    public Atama(Hai hai1, Hai hai2) {
        this.hai1 = hai1;
        this.hai2 = hai2;
    }

}
