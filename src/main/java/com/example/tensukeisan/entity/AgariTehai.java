package com.example.tensukeisan.entity;

import com.example.tensukeisan.enums.MachiType;
import lombok.Data;

@Data
public class AgariTehai {

    private Atama atama;

    private Mentsu mentsu1;

    private Mentsu mentsu2;

    private Mentsu mentsu3;

    private Mentsu mentsu4;

    private MachiType machiType;

    private boolean isChitoitsu;

    public AgariTehai(Atama atama,
                      Mentsu mentsu1, Mentsu mentsu2, Mentsu mentsu3, Mentsu mentsu4,
                      MachiType machiType,
                      boolean isChitoitsu) {
        this.atama = atama;
        this.mentsu1 = mentsu1;
        this.mentsu2 = mentsu2;
        this.mentsu3 = mentsu3;
        this.mentsu4 = mentsu4;
        this.machiType = machiType;
        this.isChitoitsu = isChitoitsu;
    }

}
