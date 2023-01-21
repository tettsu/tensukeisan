package com.example.tensukeisan.service;

import com.example.tensukeisan.entity.Atama;
import com.example.tensukeisan.entity.Mentsu;
import com.example.tensukeisan.enums.Kaze;
import com.example.tensukeisan.enums.MachiType;
import com.example.tensukeisan.enums.MentsuType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuKeisanService {

    public int fuKeisan(List<Mentsu> mentsus,
                        Atama atama,
                        MachiType machiType,
                        List<String> yakus,
                        Kaze baKaze,
                        Kaze jiKaze) {

        int resultFu = 0;

        // 副底
        resultFu += 20;

        // 七対子の場合は計算終了
        if (yakus.contains("七対子")) {
            return 25;
        }

        // 待ち種による加符
        if (MachiType.KANCHAN.equals(machiType) || MachiType.PENCHAN.equals(machiType) || MachiType.TANKI.equals(machiType)) {
            resultFu += 2;
        }

        // 頭による加符
        if (baKaze.equals(atama.getHai1()) || jiKaze.equals(atama.getHai1())) {
            resultFu += 2;
        }

        // 各メンツのごとの計算
        for (Mentsu mentsu : mentsus) {
            // 順子の場合は加符無し
            if (MentsuType.SHUNTSU.equals(mentsu.getMentsuType())) {
                resultFu += 0;
            }
            // 暗刻の場合はヤオチュウ牌は8、それ以外は4
            if (MentsuType.ANKO.equals(mentsu.getMentsuType())) {
                if (mentsu.getHai1().isYaochu()) {
                    resultFu += 8;
                } else {
                    resultFu += 4;
                }
            }
            // 明刻の場合はヤオチュウ牌は4、それ以外は2
            if (MentsuType.MINKO.equals(mentsu.getMentsuType())) {
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