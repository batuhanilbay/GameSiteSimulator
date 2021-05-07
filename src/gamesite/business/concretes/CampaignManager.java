package gamesite.business.concretes;

import gamesite.Utils;
import gamesite.business.abstracts.CampaignService;
import gamesite.entities.concretes.Campaign;
import gamesite.log.concretes.Logger;

public class CampaignManager implements CampaignService{
	
	private Logger[] loggers;
		
	public CampaignManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}
	
	
	public void addCampaign(Campaign campaign) {
		System.out.println("Add campaign:  " + campaign.getGameName());
		System.out.println("Campaign discount:  " + campaign.getDiscountRate());
		System.out.println("After discount game price: " + campaign.getPriceAfterdiscount());
		Utils.runLogger(loggers, campaign.getGameName());
	}
	
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Campaign deleted:  " + campaign.getGameName());
		Utils.runLogger(loggers, campaign.getGameName());
	}
	
	public void updateCampaign(Campaign campaign) {
		System.out.println("The campaign has been updated:  " + campaign.getGameName());
		Utils.runLogger(loggers, campaign.getGameName());
	}
	
	

}
