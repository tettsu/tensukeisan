package com.example.tensukeisan.service;

import ch.qos.logback.core.joran.sanity.Pair;
import com.example.tensukeisan.enums.MachiType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuKeisanService {

    public int fuKeisan(List<String> mentsuTypes, Pair<String, String> atama, MachiType machiType, List<String> yakus) {

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
        if ("自風牌".equals(atama.first) || "場風牌".equals(atama.first)) {
            resultFu += 2;
        }

        // 各メンツのごとの計算
        for (String mentsuType : mentsuTypes) {
            // 順子の場合は加符無し
            if ("順子".equals(mentsuType)) {
                resultFu += 0;
            }

            // 暗刻の場合はヤオチュウ牌は8、それ以外は4
            if ("暗刻".equals(mentsuType)) {
                //TODO メンツの中の牌の種類をちゃんと確認するようにFixする
                if ("么九牌".equals(mentsuType)) {
                    resultFu += 8;
                } else {
                    resultFu += 4;
                }
            }

            // 明刻の場合はヤオチュウ牌は4、それ以外は2
            if ("明刻".equals(mentsuType)) {
                //TODO メンツの中の牌の種類をちゃんと確認するようにFixする
                if ("么九牌".equals(mentsuType)) {
                    resultFu += 4;
                } else {
                    resultFu += 2;
                }
            }

        }

        return resultFu;
    }

}