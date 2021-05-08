package MernisVerification;

import Customer.Customer;
import Customer.CustomerCheckService;

public class MernisVerificationManager implements CustomerCheckService{

	@Override
	public boolean musteriDogrula(Customer customer) {
		return false;
	}

}
