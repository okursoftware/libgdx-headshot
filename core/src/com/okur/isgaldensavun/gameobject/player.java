package com.okur.isgaldensavun.gameobject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.okur.isgaldensavun.imageloader.imageLoader;

/**
 * Created by okur on 30.04.2017.
 */

public class player implements gameobject {

    private Vector2 position;
    private Vector2 size;
    private Rectangle colRec;

    public player(){
        position = new Vector2((float) (Gdx.graphics.getWidth()/2.4), (float) (Gdx.graphics.getHeight()/1.3));
        size = new Vector2(Gdx.graphics.getWidth()/4,Gdx.graphics.getWidth()/4);
        colRec = new Rectangle(position.x,position.y,size.x,size.y);

    }
    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(imageLoader.playerReg,position.x,position.y,size.x,size.y);
        sb.end();
    }

    @Override
    public void update(float delta) {
        colRec.x = position.x;
        colRec.y = position.y;
        playerHareket();
    }
    public void playerHareket(){
        float accelX = Gdx.input.getAccelerometerX();
        float accelY = Gdx.input.getAccelerometerY();
        float accelZ = Gdx.input.getAccelerometerZ();
        if(position.x>-size.x/2||position.x>-10+size.x/2){
            if(position.x<Gdx.graphics.getWidth()||position.x<Gdx.graphics.getWidth()+10){
                if(position.x<=-size.x/2||position.x<-size.x/2.3){
                    position.add(10,0);
                }
                if(position.x+size.x>Gdx.graphics.getWidth()+size.x/2){
                    position.add(-10,0);
                }
            }
            position.add(-accelX*2,0);
        }

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
