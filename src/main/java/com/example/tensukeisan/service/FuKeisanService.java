package com.example.tensukeisan.service;

import com.example.tensukeisan.entity.AgariTehai;
import com.example.tensukeisan.entity.Mentsu;
import com.example.tensukeisan.enums.Kaze;
import com.example.tensukeisan.enums.MachiType;
import com.example.tensukeisan.enums.MentsuType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuKeisanService {

    public int fuKeisan(AgariTehai agariTehai,
                        Kaze baKaze,
                        Kaze jiKaze) {

        List<Mentsu> mentsus = List.of(agariTehai.getMentsu1(),
                agariTehai.getMentsu2(),
                agariTehai.getMentsu3(),
                agariTehai.getMentsu4());

        // 七対子の場合は25符固定
        if (agariTehai.isChitoitsu()) {
            return 25;
        }

        // 副底
        int resultFu = 20;

        // 待ち種による加符
        if (MachiType.KANCHAN.equals(agariTehai.getMachiType())
                || MachiType.PENCHAN.equals(agariTehai.getMachiType())
                || MachiType.TANKI.equals(agariTehai.getMachiType())) {
            resultFu += 2;
        }

        // 頭が自風か場風牌の場合に加符する
        if (baKaze.equals(agariTehai.getAtama().getHai1().getHaiName())
                || jiKaze.equals(agariTehai.getAtama().getHai1().getHaiName())) {
            resultFu += 2;
        }

        // 各メンツのごとの計算
        for (Mentsu mentsu : mentsus) {
            if (MentsuType.SHUNTSU.equals(mentsu.getMentsuType())) {
                // 順子の場合は加符無し
                // NO-OP
            } else if (MentsuType.ANKO.equals(mentsu.getMentsuType())) {
                // 暗刻の場合はヤオチュウ牌は8、それ以外は4
                if (mentsu.getHai1().isYaochu()) {
                    resultFu += 8;
                } else {
                    resultFu += 4;
                }
            } else if (MentsuType.MINKO.equals(mentsu.getMentsuType())) {
                // 明刻の場合はヤオチュウ牌は4、それ以外は2
                if (mentsu.getHai1().isYaochu()) {
                    resultFu += 4;
                } else {
                    resultFu += 2;
                }
            }
        }

        return resultFu;
    }

}