package com.okur.isgaldensavun.isgaldensavun;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = 801;
		config.width = 480;
		new LwjglApplication(new com.okur.isgaldensavun.sef(), config);

	}
}
