package Concretes;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {

		if (customerCheckService.CheckIfRealPerson(customer) == true) {
			System.out.println("Starbucks Manager : Dogrulama basarili.");
			super.save(customer);

		} else {
			System.out.println("Starbucks Manager : Dogrulama hatali - kisi eklenemedi! ");
		}

	}

}