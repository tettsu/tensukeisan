package com.example.tensukeisan.service;

import com.example.tensukeisan.entity.AgariTehai;
import com.example.tensukeisan.entity.Atama;
import com.example.tensukeisan.entity.Hai;
import com.example.tensukeisan.entity.Mentsu;
import com.example.tensukeisan.enums.HaiType;
import com.example.tensukeisan.enums.Kaze;
import com.example.tensukeisan.enums.MachiType;
import com.example.tensukeisan.enums.MentsuType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class FuKeisanServiceTest {

    @Test
    void Test1() {
        // テンパイ: 北北一二三⑤⑤⑤78白白白
        // ツモ: 9
        // 場風: 東
        // 自風: 南
        Atama atama = new Atama(
                new Hai("北", HaiType.JIHAI, null, true),
                new Hai("北", HaiType.JIHAI, null, true)
        );
        Mentsu mentsu1 = new Mentsu(
                new Hai("一萬", HaiType.MANZU, 1, true),
                new Hai("二萬", HaiType.MANZU, 2, false),
                new Hai("三萬", HaiType.MANZU, 3, false),
                MentsuType.SHUNTSU
        );
        Mentsu mentsu2 = new Mentsu(
                new Hai("五筒", HaiType.PINZU, 5, false),
                new Hai("五筒", HaiType.PINZU, 5, false),
                new Hai("五筒", HaiType.PINZU, 5, false),
                MentsuType.ANKO
        );
        Mentsu mentsu3 = new Mentsu(
                new Hai("七索", HaiType.SOZU, 7, false),
                new Hai("八索", HaiType.SOZU, 8, false),
                new Hai("九索", HaiType.SOZU, 9, true),
                MentsuType.SHUNTSU
        );
        Mentsu mentsu4 = new Mentsu(
                new Hai("白", HaiType.JIHAI, null, true),
                new Hai("白", HaiType.JIHAI, null, true),
                new Hai("白", HaiType.JIHAI, null, true),
                MentsuType.ANKO
        );

        AgariTehai tehai = new AgariTehai(atama,
                mentsu1, mentsu2, mentsu3, mentsu4,
                MachiType.RYANMEN, false);

        assertEquals(32, FuKeisanService.fuKeisan(tehai, Kaze.EAST, Kaze.SOUTH));

    }
}