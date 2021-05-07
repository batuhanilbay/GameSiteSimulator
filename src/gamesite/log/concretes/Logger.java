package gamesite.log.concretes;

import gamesite.log.abstracts.LoggerService;

public class Logger implements LoggerService{

	public void log(String message) {
		System.out.println("Common registration area");
		
	}

}
