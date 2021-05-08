package Customer;

public class CustomerManager implements CustomerService {

	CustomerService customerService;

	@Override
	public void add(Customer customer) {

		System.out.println("Added in Customer");

	}

	@Override
	public void remove(Customer customer) {

		System.out.println("Remove in Customer");

	}

	@Override
	public void update(Customer customer) {
		System.out.println("Update in Customer");
	}

}
