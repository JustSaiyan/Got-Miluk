package com.munchingtime.gotmiluk;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	TextureRegion textbackground;

	@Override
	public void create () {
		batch = new SpriteBatch();
		textbackground = new TextureRegion(new Texture("Background for game.jpg"), 0, 0, 2048, 563);
	}

	@Override
	public void render () {
		batch.begin();
		batch.draw(textbackground, 0, 0);
		batch.draw(textbackground, 0, Gdx.graphics.getHeight());
		batch.end();

	}


	
	@Override
	public void dispose () {
		batch.dispose();

	}
}
