package com.okur.isgaldensavun;

import com.okur.isgaldensavun.gameobject.dusman;
import com.okur.isgaldensavun.gameobject.dusmanKursun;
import com.okur.isgaldensavun.gameobject.mermi;
import com.okur.isgaldensavun.gameobject.player;

import java.util.ArrayList;

/**
 * Created by okur on 30.04.2017.
 */

public class carpismaKontrol {

    public static boolean carpmaKontrol(player gemi, ArrayList<dusman> ufolar) {

        for(int i =0 ; i<ufolar.size();i++){
            if (gemi.getColRec().overlaps(ufolar.get(i).getColRec())) {
                ufolar.remove(i);
                return true;
            }
        }
        return false;
    }
    public static boolean carpmaKontrol2(player gemi, ArrayList<dusmanKursun> dkursunlar) {

        for(int i =0 ; i<dkursunlar.size();i++){
            if (gemi.getColRec().overlaps(dkursunlar.get(i).getColRec())) {
                dkursunlar.remove(i);
                return true;
            }
        }
        return false;
    }

    public static boolean carpmaKontrol(ArrayList<dusman> ufolar, ArrayList<mermi> mermiler) {

        for (int i = 0; i < mermiler.size(); i++) {
            for (int j = 0; j < ufolar.size(); j++) {
                if (ufolar.get(j).getColRec().overlaps(mermiler.get(i).getColRec())) {
                    mermiler.remove(i);
                    ufolar.remove(j);
                    return true;
                }
            }
        }

        return false;
    }
}