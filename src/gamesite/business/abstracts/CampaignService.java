package gamesite.business.abstracts;

import gamesite.entities.concretes.Campaign;

public interface CampaignService {
	
	void addCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);
	

}
