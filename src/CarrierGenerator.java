import model.Carrier;
import model.Instance;


public class CarrierGenerator {
	
	private int nrCarriers;
	private Instance instance;
	
	public CarrierGenerator(Instance instance){
		this.nrCarriers=instance.getNrCarriers();
		this.instance=instance;
	}
	
	public void loadCarriers(){
		generateCarriers();
	}

	private void generateCarriers() {
		for(int i=1; i<=nrCarriers; i++){
			Carrier c = new Carrier(i, "carrier"+i);
			instance.addCarrier(c);
		}
	}
	
	

}
