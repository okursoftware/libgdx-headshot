package com.okur.isgaldensavun.imageloader;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by okur on 18.04.2017.
 */

public class imageLoader {
    public static Texture deneme,dusman,player,kursun,arkaplan,menu,gameover,kursunD;
    public static TextureRegion denemeReg,playerReg,dusmanReg,kursunReg,arkaplanReg,menuArkaPlan
            ,basla1,basla2,yardim1,yardim2,score1,score2,cik1,cik2,yardimArka,gameoverReg,kursunDReg;

    public static BitmapFont font;
    public  static Texture fontTexture;
    public static void Load() {

        kursunD = new Texture(Gdx.files.internal("kursun.png") );
        kursunDReg = new TextureRegion(kursunD,0,0,kursunD.getWidth(),kursunD.getHeight());


        gameover = new Texture(Gdx.files.internal("gameover.png"));
        gameoverReg = new TextureRegion(gameover,0,0,gameover.getWidth(),gameover.getHeight());
        gameoverReg.flip(false,true);

        menu = new Texture(Gdx.files.internal("menu.png"));

        menuArkaPlan = new TextureRegion(menu, 0, 0, 800, 1143);
        menuArkaPlan.flip(false, true);

        basla1 = new TextureRegion(menu,800,0,378,160);
        basla1.flip(false,true);
        basla2 = new TextureRegion(menu,1178,0,378,160);
        basla2.flip(false,true);

        yardim1 = new TextureRegion(menu,800,193,378,160);
        yardim1.flip(false,true);
        yardim2 = new TextureRegion(menu,1179,193,378,160);
        yardim2.flip(false,true);

        score1 = new TextureRegion(menu,800,391,378,160);
        score1.flip(false,true);
        score2 = new TextureRegion(menu,1179,391,378,160);
        score2.flip(false,true);

        cik1 = new TextureRegion(menu,800,583,378,160);
        cik1.flip(false,true);
        cik2 = new TextureRegion(menu,1179,583,378,160);
        cik2.flip(false,true);

        yardimArka = new TextureRegion(menu , 0 , 1141,423,569);
        yardimArka.flip(false,true);



        font = new BitmapFont(Gdx.files.internal("font.fnt"),true);
        font.getData().setScale((float) 2);
        fontTexture = new Texture(Gdx.files.internal("font.png"));

        fontTexture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        deneme = new Texture("badlogic.jpg");
        denemeReg = new TextureRegion(deneme, 0, 0, deneme.getWidth(), deneme.getHeight());
        denemeReg.flip(false, true);

        player = new Texture("rsmSoloTR.png");
        playerReg = new TextureRegion(player, 0, 0, player.getWidth(), player.getHeight());
        playerReg.flip(false, true);

        kursun = new Texture("rsmKursun.png");
        kursunReg = new TextureRegion(kursun, 0, 0, kursun.getWidth(), kursun.getHeight());
        kursunReg.flip(false, true);
        dusman = new Texture("rsmDusman.png");
        dusmanReg = new TextureRegion(dusman, 0, 0, dusman.getWidth(), dusman.getHeight());
        dusmanReg.flip(false, true);

        arkaplan = new Texture("rsmArkaPlan.png");
        arkaplanReg = new TextureRegion(arkaplan, 0, 0, arkaplan.getWidth(), arkaplan.getHeight());
        arkaplanReg.flip(false, true);



    }

    public static void dispose(){
        deneme.dispose();
    }

}
