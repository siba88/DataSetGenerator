package model;

public class ChassisTemp {
	
	private int chassis_id;
	private int chassis_type;
	private boolean coupled;
	private Customer customer;
	private Vehicle vehicle;

	public ChassisTemp(int chassis_id, int chassis_type, boolean coupled,
			Customer customer) {
		super();
		this.chassis_id = chassis_id;
		this.chassis_type = chassis_type;
		this.coupled = coupled;
		this.customer = customer;
	}

	public int getChassis_id() {
		return chassis_id;
	}

	public void setChassis_id(int chassis_id) {
		this.chassis_id = chassis_id;
	}

	public int getChassis_type() {
		return chassis_type;
	}

	public void setChassis_type(int chassis_type) {
		this.chassis_type = chassis_type;
	}

	public boolean isCoupled() {
		return coupled;
	}

	public void setCoupled(boolean coupled) {
		this.coupled = coupled;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
