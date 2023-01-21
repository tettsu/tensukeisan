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

}
