package model;

import java.util.ArrayList;

public class Customer {

	private int customer_id;
	private String name;
	private boolean uncoupling;
	private Location location;
	private ArrayList<Chassis> chassis;

	public Customer(int customer_id, String name, boolean uncoupling,
			Location location) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.uncoupling = uncoupling;
		this.location = location;
		this.chassis = new ArrayList<Chassis>();
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isUncoupling() {
		return uncoupling;
	}

	public void setUncoupling(boolean uncoupling) {
		this.uncoupling = uncoupling;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public ArrayList<Chassis> getChassis() {
		return chassis;
	}

	public void setChassis(ArrayList<Chassis> chassis) {
		this.chassis = chassis;
	}
	
	public void addChassis(Chassis c){
		this.chassis.add(c);
	}

}
