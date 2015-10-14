package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "customer")
@XmlAccessorType (XmlAccessType.FIELD)
public class Customer {

	private int customer_id;
	private String name;
	private boolean uncoupling;
	private Location location;
	
	

	public Customer() {
		super();
	}

	public Customer(int customer_id, String name, boolean uncoupling,
			Location location) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.uncoupling = uncoupling;
		this.location = location;
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

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name
				+ ", uncoupling=" + uncoupling + ", location=" + location.toString()
				+ "]";
	}
	
	

}
