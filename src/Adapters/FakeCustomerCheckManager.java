package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;


public class FakeCustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}
}