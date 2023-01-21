package com.example.tensukeisan.entity;


import com.example.tensukeisan.enums.MentsuType;
import lombok.Data;

@Data
public class Mentsu {

    private Hai hai1;

    private Hai hai2;

    private Hai hai3;

    private MentsuType mentsuType;

}
