import Campaign.Campaign;
import Campaign.CampaignManager;
import Customer.Customer;
import Customer.CustomerManager;
import Game.Game;
import Game.GameManager;
import Sales.SalesManager;

public class Main {

	public static void main(String[] args) {

		Customer customer = new Customer(1, "Shahriyar", "Hasanov", 2003, "1460462");

		Campaign campaign = new Campaign(1, "Monday Syndrome", 11);

		Campaign campaign2 = new Campaign(2, "Black Friday", 8);

		Game game = new Game(1, "Grand Theft Auto", 170);

		Game game2 = new Game(2, "Counter-Strike: Global Offensive", 24);

		Game game3 = new Game(3, "Forza Horizon 4", 92);

		CustomerManager customerManager = new CustomerManager();
		customerManager.add(customer);

		System.out.println("***************************************");

		GameManager gameManager = new GameManager();
		gameManager.addGame(game);

		System.out.println("***************************************");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.newAdd(campaign);

		System.out.println("***************************************");

		SalesManager storeManager = new SalesManager();
		storeManager.salesGame(game, customer);

		storeManager.salesGameWithCampaign(game2, customer, campaign);

	}

}
