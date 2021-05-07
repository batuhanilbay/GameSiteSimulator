package gamesite.entities.concretes;

//Game class features have been inherited to the Sale class.


public class Sale extends Game{
	
	private String gamesTosell;
	
	public Sale() {
		
	}
	
	public Sale(int gameId,String gameName,double gamePrice,String gamesTosell) {
		super(gameId,gameName,gamePrice);
		this.gamesTosell = gamesTosell;
		
		
	}

	public String getGamesTosell() {
		return gamesTosell;
	}

	public void setGamesTosell(String gamesTosell) {
		this.gamesTosell = gamesTosell;
	}
	
	
	
}
