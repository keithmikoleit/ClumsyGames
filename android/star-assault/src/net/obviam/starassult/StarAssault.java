package net.obviam.starassult;

import net.obviam.starassult.screens.GameScreen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;

public class StarAssault extends Game {
	
	@Override
	public void create() {		
		setScreen(new GameScreen());
	}

	@Override
	public void dispose() {
	}

	@Override
	public void render() {		

	}

	@Override
	public void resize(int width, int height) {
		
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
