package gamesite.business.abstracts;

import gamesite.entities.concretes.Gamer;

public interface GamerService {
	
	void addGamer(Gamer gamer);
	void deleteGamer(Gamer gamer);
	void updateGamer(Gamer gamer);
	

}
