package fr.lipn.starwars.chapterone.graphism.resources;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

/**
 * The Class ImageLoader is a singleton which load / create instances of
 * {@link Animation}s
 */
public class SpriteLoader {

	public static final int ANIMATION_DURATION = 150;
	private static final String SPRITES_BASE_PATH = "assets/sprites/";

	public Graphic loadPlayerSpaceShip() throws SlickException {
		SpriteSheet sprites = new SpriteSheet(SPRITES_BASE_PATH + "ship/Spritesheet_64x29.png", 64, 29);
		Animation xWing = new Animation();
		xWing.addFrame(sprites.getSprite(0, 0), ANIMATION_DURATION);
		xWing.addFrame(sprites.getSprite(0, 1), ANIMATION_DURATION);
		xWing.addFrame(sprites.getSprite(0, 2), ANIMATION_DURATION);
		xWing.setAutoUpdate(false);
		xWing.setCurrentFrame(0);
		return new Graphic(xWing, 64, 29);
	}
	
	public Graphic loadXWingAnimation() throws SlickException {
		return new Graphic(new Image(SPRITES_BASE_PATH + "enemy/eSpritesheet_40x30_hue1.png"), 40, 30);
	}
	
	public Graphic loadYWingAnimation() throws SlickException {
		return new Graphic(new Image(SPRITES_BASE_PATH + "enemy/eSpritesheet_40x30_hue2.png"), 40, 30);
	}
	
	public Graphic loadTIEBomberAnimation() throws SlickException {
		return new Graphic(new Image(SPRITES_BASE_PATH + "enemy/eSpritesheet_40x30_hue3.png"), 40, 30);
	}
	
	public Graphic loadBorvoAnimation() throws SlickException {
		return new Graphic(new Image(SPRITES_BASE_PATH + "enemy/eSpritesheet_40x30_hue4.png"), 40, 30);
	}
	
	public Graphic loadDefaultAnimation() throws SlickException {
		return new Graphic(new Image(SPRITES_BASE_PATH + "enemy/eSpritesheet_40x30.png"), 40, 30);
	}

}
