import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import model.Instance;


public class Generator {
	
	static Instance instance = new Instance();
	static Properties props = new Properties();

	public static void main(String[] args) {
		
		readConfig();
		initializeInstance();
		
		CarrierGenerator carrierGen = new CarrierGenerator(instance);
		carrierGen.loadCarriers();
		CustomerGenerator customerGen = new CustomerGenerator(instance);
		customerGen.loadCustomers();
		
		
		
	}

	private static void readConfig() {
		InputStream in;
		try {
			in = new FileInputStream("config.properties");
			props.load(in);
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void initializeInstance() {
		instance.setFileName(props.get("FILE_NAME").toString());
		instance.setNrVehicles(Integer.valueOf(props.get("NR_OF_VEHICLES").toString()));
		instance.setNrCustomers(Integer.valueOf(props.get("NR_OF_CUSTOMERS").toString()));
		instance.setNrUncouplingCustomers(Integer.valueOf(props.get("NR_OF_UNCOUPLING_CUSTOMERS").toString()));
		instance.setNrCarriers(Integer.valueOf(props.get("NR_OF_CARRIERS").toString()));
		instance.setNrChassis(Integer.valueOf(props.get("NR_OF_CHASSIS_TYPES").toString()));
		instance.setNrOrders(Integer.valueOf(props.get("NR_OF_ORDERS").toString()));
		instance.setRadius(Integer.valueOf(props.get("CUSTOMER_LOCATIONS_RADIUS").toString()));
		instance.setWindowTime(Integer.valueOf(props.get("WINDOW_TIME_DURATION").toString()));
		instance.setServiceTimeMin(Integer.valueOf(props.get("SERVICE_DUR_MIN").toString()));
		instance.setServiceTimeMax(Integer.valueOf(props.get("SERVICE_DUR_MAX").toString()));
		
	}

}
