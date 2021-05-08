package Sales;

import Campaign.Campaign;
import Customer.Customer;
import Game.Game;

public class SalesManager implements SalesService {

	@Override
	public void salesGame(Game game, Customer customer) {
		System.out.println(customer.getFirstName() + " adlı kullanıcı " + game.getPrice() + "  TL-ye " + game.getGameName()
				+ " oyununu aldı");

	}

	@Override
	public void salesGameWithCampaign(Game game, Customer customer, Campaign campaign) {

		double priceWithDiscount = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);

		System.out.println(game.getGameName() + " adlı oyun " + campaign.getCampaignName() + " kampanyasıyla "
				+ customer.getFirstName() + " kullanicisi tarafindan " + priceWithDiscount + " TL-ye alınmıştır");
	}

}
