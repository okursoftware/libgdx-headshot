package com.okur.isgaldensavun.gameobject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.okur.isgaldensavun.imageloader.imageLoader;

/**
 * Created by okur on 30.04.2017.
 */

public class mermi implements gameobject {

    private Vector2 position;
    private Vector2 size;
    private Rectangle colRec;
    public mermi(float x, float y){
        position = new Vector2(x,y);
        size = new Vector2(Gdx.graphics.getWidth()/28,Gdx.graphics.getWidth()/32);
        colRec = new Rectangle(position.x,position.y,size.x,size.y);
    }
    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(imageLoader.kursunReg,position.x,position.y,size.x,size.y);
        sb.end();
    }

    @Override
    public void update(float delta) {
        colRec.x = position.x;
        colRec.y = position.y;
        mermiHareket();
    }
    public void mermiHareket(){
        position.add(0,-8);
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Vector2 getSize() {
        return size;
    }

    public void setSize(Vector2 size) {
        this.size = size;
    }

    public Rectangle getColRec() {
        return colRec;
    }

    public void setColRec(Rectangle colRec) {
        this.colRec = colRec;
    }
}
