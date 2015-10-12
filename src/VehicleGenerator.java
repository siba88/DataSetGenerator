import java.util.Random;

import model.Instance;
import model.Vehicle;


public class VehicleGenerator {
	
	Instance instance;
	Random rand;
	
	public VehicleGenerator(Instance instance){
		this.instance = instance;
		rand = new Random();
	}
	
	public void loadVehicles(){
		generateVehicles();
	}

	private void generateVehicles() {
		for(int i=1; i<=instance.getNrVehicles(); i++){
			Vehicle v = new Vehicle(i, instance.getCustomers().get(0).getLocation(),false, false);
			assignCarrier(v);
			instance.addVehicle(v);
		}
	}
	
	private void assignCarrier(Vehicle v){
		v.setCarrier(instance.getCarriers().get(rand.nextInt(instance.getNrCarriers()-1)));
	}

}
