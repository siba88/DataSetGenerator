import model.Chassis;
import model.Instance;


public class ChassisGenerator {
	
	Instance instance;

	public ChassisGenerator(Instance instance) {
		this.instance = instance;
	}
	
	public void loadChassis(){
		for(int i=1; i<= instance.getNrChassis(); i++){
			for(int j=1; j<=instance.getNrVehicles(); j++){
				Chassis c = new Chassis(i*j, i, false, instance.getCustomers().get(0));
			}
		}
	}
	

}
