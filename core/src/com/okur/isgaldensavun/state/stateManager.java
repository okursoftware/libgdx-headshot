package com.okur.isgaldensavun.state;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by okur on 18.04.2017.
 */

public class stateManager {

    //bu state ler stack yapısı ile  çalışacak örneğin menuler
    private Stack<state> states;

    public stateManager(){

        states=new Stack<state>();

    }
    public void render(SpriteBatch sb){
        states.peek().render(sb);

    }
    public void update(float delta){
        states.peek().update(delta);

    }
    public void pushState(state state){
        states.push(state);
    }
    public void popState(state state){
        states.pop();
    }
}
