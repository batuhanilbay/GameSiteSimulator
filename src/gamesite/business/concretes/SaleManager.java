package gamesite.business.concretes;

import gamesite.Utils;
import gamesite.business.abstracts.SaleService;
import gamesite.entities.concretes.Sale;
import gamesite.log.concretes.Logger;

public class SaleManager implements SaleService{
	
	private Logger[] loggers;

	public SaleManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
		
	}

	@Override
	public void showSale(Sale sale) {
		System.out.println("The game has been sold:  " + sale.getGameName());
		Utils.runLogger(loggers, sale.getGameName());
		
	}
	
	

}
