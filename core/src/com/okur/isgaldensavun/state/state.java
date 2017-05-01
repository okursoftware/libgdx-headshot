package com.okur.isgaldensavun.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by okur on 18.04.2017.
 */

public abstract class state {


    //

    protected OrthographicCamera camera;

    public state(stateManager sm){

        camera = new OrthographicCamera();
        camera.setToOrtho(true, Gdx.graphics.getWidth(),Gdx.graphics.getHeight());


    }
    public abstract void render(SpriteBatch sb);
    public abstract void update(float delta);
    public abstract void dispose();

}
