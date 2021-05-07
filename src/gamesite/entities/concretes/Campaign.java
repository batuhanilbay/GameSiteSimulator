package gamesite.entities.concretes;

import gamesite.entities.abstracts.Entity;

//The campaign class is linked to the game class.
//The discount rate is expressed as a percentage.


public class Campaign implements Entity{
	
	private int gameId;
	private String gameName;
	private double discountRate;
	private double priceAfterdiscount;
	
	
	
	public Campaign()
	{
		
	}

	
	public Campaign(int gameId, String gameName,double gamePrice, double discountRate, double priceAfterdiscount) {
		super();
		this.setGameId(gameId);
		this.setGameName(gameName);
		this.discountRate = discountRate;
		this.priceAfterdiscount = priceAfterdiscount;
		
		
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	public double getPriceAfterdiscount() {
		return this.priceAfterdiscount - (this.priceAfterdiscount * this.discountRate / 100);
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


	





	

	




}
