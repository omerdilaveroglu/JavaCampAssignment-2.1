
import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.FakeCustomerCheckManager;
import Adapters.MernisServiceAdapter;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1,"Ömer Faruk", "Dilaveroglu",1997,"123123131123"));
		
		

	}

}
