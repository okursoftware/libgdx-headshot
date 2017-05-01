package com.okur.isgaldensavun.gameobject;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by okur on 30.04.2017.
 */

public interface gameobject {

    public  void render(SpriteBatch sb);

    public void update(float delta);
}