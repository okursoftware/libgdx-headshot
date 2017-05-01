package com.okur.isgaldensavun.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.okur.isgaldensavun.imageloader.imageLoader;

/**
 * Created by okur on 30.04.2017.
 */

public class gameover extends state {

    private int score;
    public gameover(stateManager sm,int score) {
        super(sm);
        this.score = score;
    }

    @Override
    public void render(SpriteBatch sb) {

        sb.begin();
        sb.draw(imageLoader.gameoverReg,0,0, Gdx.graphics.getWidth(),Gdx.graphics.getWidth());
        imageLoader.font.draw(sb, "score = " + Integer.toString(score),Gdx.graphics.getWidth()/4, (float) (Gdx.graphics.getHeight()/1.5));
        sb.end();

    }

    @Override
    public void update(float delta) {

    }

    @Override
    public void dispose() {

    }
}
