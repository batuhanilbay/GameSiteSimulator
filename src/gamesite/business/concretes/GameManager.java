package gamesite.business.concretes;

import gamesite.Utils;
import gamesite.business.abstracts.GameService;
import gamesite.entities.concretes.Game;
import gamesite.log.concretes.Logger;

public class GameManager implements GameService {
	
	private Logger[] loggers;

	public GameManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	
	public void addGame(Game game) {
		
		System.out.println("The game has been added:  " + game.getGameName());
		Utils.runLogger(loggers, game.getGameName());
	}
	
	public void deleteGame(Game game) {
		
		System.out.println("The game has been deleted:  " + game.getGameName());
		Utils.runLogger(loggers, game.getGameName());
	}
	
	public void updateGame(Game game) {
		
		System.out.println("The game has been updated:  " + game.getGameName());
		Utils.runLogger(loggers, game.getGameName());
	}
	
	
	
}
