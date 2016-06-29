package pl.dawidszczesniak.screens;
import com.badlogic.gdx.graphics.Texture;

import pl.dawidszczesniak.TutorialClickerGame;

public class SplashScreen extends AbstractScreen {

	private Texture splashImg;
	
	public SplashScreen(TutorialClickerGame game) {
		super(game);
	init();
	}

	private void init() {
		splashImg = new Texture("badlogic.jpg");
	}
	
	public void render(float delta) {
		super.render(delta);;
		spriteBatch.begin();
		spriteBatch.draw(splashImg, 0, 0);
		spriteBatch.end();
	}
	
	
}
