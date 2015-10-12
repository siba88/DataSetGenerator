import java.util.Random;

import model.Customer;
import model.Instance;
import model.Location;


public class CustomerGenerator {
	
	private Instance instance;
	private Random rand;
	
	public CustomerGenerator(Instance instance){
		this.instance=instance;
		rand = new Random();
	}
	
	public void loadCustomers(){
		generateDepot();
		generateCustomers();
	}

	private void generateDepot(){
		Customer depot = new Customer(0, "Depot", true, new Location(0,0));
		instance.addCustomer(depot);
	}
	
	private void generateCustomers() {
		for(int i=1; i<=instance.getNrCustomers(); i++){
			Customer c = new Customer(i, "Customer"+i, false, new Location(rand.nextInt(200)-100, rand.nextInt(200)-100));
			instance.addCustomer(c);
		}
		generateUncouplingCustomers();
	}

	private void generateUncouplingCustomers() {
		if(instance.getNrUncouplingCustomers()<instance.getNrCustomers()){
			int i=0;
			while(i<instance.getNrUncouplingCustomers()){
				System.out.println();
				Customer c = instance.getCustomers().get(rand.nextInt(instance.getCustomers().size()-1));
				if(!c.isUncoupling()){
					c.setUncoupling(true);
					i++;
				}
			}
		}
		else{
			for(Customer c: instance.getCustomers()){
				c.setUncoupling(true);
			}
		}
		
	}
	
	

}
