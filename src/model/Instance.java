package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "instance")
@XmlAccessorType (XmlAccessType.FIELD)
public class Instance {

	private String fileName;

	private int nrCarriers;
	private int nrVehicles;
	private int nrCustomers;
	private int nrUncouplingCustomers;
	private int nrChassis;
	private int nrOrders;
	private int radius;
	private int windowTime;
	private int serviceTimeMin;
	private int serviceTimeMax;

	@XmlElementWrapper
    @XmlElement(name="carrier")
	private ArrayList<Carrier> carriers;
	@XmlElementWrapper
    @XmlElement(name="vehicle")
	private ArrayList<Vehicle> vehicles;
	@XmlElementWrapper
    @XmlElement(name="customer")
	private ArrayList<Customer> customers;
	private ArrayList<Chassis> chassis;
	@XmlElementWrapper
    @XmlElement(name="order")
	private ArrayList<Order> orders;
	private ArrayList<Chassis> chassisTemp;

	public Instance() {
		carriers = new ArrayList<Carrier>();
		vehicles = new ArrayList<Vehicle>();
		customers = new ArrayList<Customer>();
		orders = new ArrayList<Order>();
		chassis = new ArrayList<Chassis>();
		chassisTemp = new ArrayList<Chassis>();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getNrCarriers() {
		return nrCarriers;
	}

	public void setNrCarriers(int nrCarriers) {
		this.nrCarriers = nrCarriers;
	}

	public int getNrVehicles() {
		return nrVehicles;
	}

	public void setNrVehicles(int nrVehicles) {
		this.nrVehicles = nrVehicles;
	}

	public int getNrCustomers() {
		return nrCustomers;
	}

	public void setNrCustomers(int nrCustomers) {
		this.nrCustomers = nrCustomers;
	}

	public int getNrUncouplingCustomers() {
		return nrUncouplingCustomers;
	}

	public void setNrUncouplingCustomers(int nrUncouplingCustomers) {
		this.nrUncouplingCustomers = nrUncouplingCustomers;
	}

	public int getNrChassis() {
		return nrChassis;
	}

	public void setNrChassis(int nrChassis) {
		this.nrChassis = nrChassis;
	}

	public int getNrOrders() {
		return nrOrders;
	}

	public void setNrOrders(int nrOrders) {
		this.nrOrders = nrOrders;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getWindowTime() {
		return windowTime;
	}

	public void setWindowTime(int windowTime) {
		this.windowTime = windowTime;
	}

	public int getServiceTimeMin() {
		return serviceTimeMin;
	}

	public void setServiceTimeMin(int serviceTimeMin) {
		this.serviceTimeMin = serviceTimeMin;
	}

	public int getServiceTimeMax() {
		return serviceTimeMax;
	}

	public void setServiceTimeMax(int serviceTimeMax) {
		this.serviceTimeMax = serviceTimeMax;
	}

	public ArrayList<Carrier> getCarriers() {
		return carriers;
	}

	public void setCarriers(ArrayList<Carrier> carriers) {
		this.carriers = carriers;
	}

	public void addCarrier(Carrier c) {
		carriers.add(c);
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public void addCustomer(Customer c) {
		this.customers.add(c);
	}

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(ArrayList<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public void addVehicle(Vehicle v) {
		this.vehicles.add(v);
	}

	public ArrayList<Chassis> getChassis() {
		return chassis;
	}

	public void setChassis(ArrayList<Chassis> chassis) {
		this.chassis = chassis;
	}

	public void addChassis(Chassis c) {
		this.chassis.add(c);
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	
	public void addOrder(Order o){
		this.orders.add(o);
	}
	
	public ArrayList<Chassis> getChassisTemp() {
		return chassisTemp;
	}

	public void setChassisTemp(ArrayList<Chassis> chassis) {
		this.chassis = chassis;
	}

	public void addChassisTemp(Chassis c) {
		this.chassisTemp.add(c);
	}

	@Override
	public String toString() {
		return "Instance[ \nfileName=" + fileName + "\nnrCarriers=" + nrCarriers
				+ "\nnrVehicles=" + nrVehicles + "\nnrCustomers=" + nrCustomers
				+ "\nnrUncouplingCustomers=" + nrUncouplingCustomers
				+ "\nnrChassis=" + nrChassis + "\nnrOrders=" + nrOrders
				+ "\nradius=" + radius + "\nwindowTime=" + windowTime
				+ "\nserviceTimeMin=" + serviceTimeMin + "\nserviceTimeMax="
				+ serviceTimeMax + "\ncarriers=" + carriers.toString() + "\nvehicles="
				+ vehicles.toString() + "\ncustomers=" + customers + "\nchassis="
				+ chassis + "\norders=" + orders + "]";
	}
	
	

}
