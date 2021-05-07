package gamesite.entities.concretes;

import gamesite.entities.abstracts.Entity;

//Necessary definitions have been give for game. 
//The game id, game name and game price have been defined.


public class Game implements Entity {
	
	
	
	private int gameId;
	private String gameName;
	private double gamePrice;
	
	public Game() {
		
	}

	public Game(int gameId, String gameName, double gamePrice) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}


	
	
	
}
