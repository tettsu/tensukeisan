package com.example.tensukeisan.entity;


import com.example.tensukeisan.enums.MentsuType;
import lombok.Data;

@Data
public class Mentsu {

    private Hai hai1;

    private Hai hai2;

    private Hai hai3;

    private MentsuType mentsuType;

    public Mentsu(Hai hai1, Hai hai2, Hai hai3, MentsuType mentsuType) {
        this.hai1 = hai1;
        this.hai2 = hai2;
        this.hai3 = hai3;
        this.mentsuType = mentsuType;
    }

}
