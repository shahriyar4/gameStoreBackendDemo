package Sales;

import Campaign.Campaign;
import Customer.Customer;
import Game.Game;

public interface SalesService {

	void salesGame(Game game, Customer customer);

	void salesGameWithCampaign(Game game, Customer customer, Campaign campaign);
}
