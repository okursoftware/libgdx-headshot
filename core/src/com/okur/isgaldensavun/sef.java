package com.okur.isgaldensavun;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.okur.isgaldensavun.state.menustate;
import com.okur.isgaldensavun.state.playscreen;

public class sef extends ApplicationAdapter {
	private SpriteBatch sb;

	private static com.okur.isgaldensavun.state.stateManager sm;
	
	@Override
	public void create () {
		com.okur.isgaldensavun.imageloader.imageLoader.Load();

		sm= new com.okur.isgaldensavun.state.stateManager();
		sm.pushState(new menustate(sm));
		sb= new SpriteBatch();


	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		sm.render(sb);
		sm.update(Gdx.graphics.getDeltaTime());

	}
	
	@Override
	public void dispose () {
		com.okur.isgaldensavun.imageloader.imageLoader.dispose();

	}
}
