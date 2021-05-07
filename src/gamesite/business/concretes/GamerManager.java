package gamesite.business.concretes;

import gamesite.Utils;
import gamesite.business.abstracts.GamerService;
import gamesite.core.MernisAdapter;
import gamesite.entities.concretes.Gamer;
import gamesite.log.concretes.Logger;

public class GamerManager implements GamerService{
	private Logger[] loggers;

	public GamerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	
	public GamerManager(MernisAdapter mernisAdapter) {
		// TODO Auto-generated constructor stub
	}

	public void addGamer(Gamer gamer) {
		System.out.println("The gamer has registered:  " + gamer.getFirstName() + gamer.getLastName());
		Utils.runLogger(loggers, gamer.getEmail());
	}
	public void deleteGamer(Gamer gamer) {
		System.out.println("The gamer has deleted:  " + gamer.getFirstName() + gamer.getLastName());
		Utils.runLogger(loggers, gamer.getEmail());
	}
	public void updateGamer(Gamer gamer) {
		System.out.println("The gamer has updated:  " + gamer.getFirstName() + gamer.getLastName());
		Utils.runLogger(loggers, gamer.getEmail());
	}

}
