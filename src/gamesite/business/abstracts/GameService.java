package gamesite.business.abstracts;

import gamesite.entities.concretes.Game;

public interface GameService {
	
	void addGame(Game game);
	void deleteGame(Game game);
	void updateGame(Game game);
	
}
