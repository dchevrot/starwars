package fr.lipn.starwars.chapterone.spaceships;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.newdawn.slick.GameContainer;

import fr.lipn.starwars.chapterone.graphism.exception.GraphicEngineException;
import fr.lipn.starwars.chapterone.motion.Position;

public class BattleField implements Iterable<SpaceShip> {

	private static final SpaceShipFactory spaceShipFactory = new SpaceShipFactory();

	private List<SpaceShip> spaceShips;
	private SpaceShip player;
	
	private static List<SpaceShip> createSpaceShips() {
        try {
			return Arrays.asList(
					spaceShipFactory.createYWing(new Position(1,1)),
					spaceShipFactory.createXWing(new Position(100,10)),
					spaceShipFactory.createTIEBomber(new Position(200,20)),
					spaceShipFactory.createBorvo(new Position(300,20))
			);
		} catch (GraphicEngineException e) {
			throw new AssertionError("Impossible to create spaceships", e);
		}
	}
	
	private static SpaceShip createPlayer(GameContainer gameContainer) {
		try {
			return spaceShipFactory.createPlayer(gameContainer, new Position(400,400));
		} catch (GraphicEngineException e) {
			throw new AssertionError("Impossible to create the player spaceship", e);
		}
	}

	public void init(GameContainer gameContainer) {
		spaceShips = createSpaceShips();
		player = createPlayer(gameContainer);
	}

	@Override
	public Iterator<SpaceShip> iterator() {
		return spaceShips.iterator();
	}
	
	public SpaceShip getPlayer() {
		return player;
	}

}

