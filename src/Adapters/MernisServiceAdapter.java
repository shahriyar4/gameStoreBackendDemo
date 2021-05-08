package Adapters;

import java.rmi.RemoteException;

import Customer.Customer;
import Customer.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean musteriDogrula(Customer customer) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		boolean result = false;

		try {
			return result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationallyId()),
					customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
		} catch (NumberFormatException | RemoteException e) {

			e.printStackTrace();

			System.out.println("Mernis Dogrulama Calismiyor");
		}
		return result;

	}
}
