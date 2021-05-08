package Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void newAdd(Campaign campaign) {
		System.out.println("New campaign added");

	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("campaign remove");

	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(" campaign update");

	}

}
