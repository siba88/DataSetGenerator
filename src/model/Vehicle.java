package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vehicle")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vehicle {

	private int vehicleId;
	private Carrier carrier;
	private Location location;
	private boolean chassisOn;
	private Chassis chassis;
	private boolean busy;

	public Vehicle() {
		super();
	}

	public Vehicle(int vehicleId, Location location, boolean chassisOn,
			boolean busy) {
		super();
		this.vehicleId = vehicleId;
		this.location = location;
		this.busy = busy;
	}

	public Vehicle(int vehicleId, Carrier carrier, Location location,
			Chassis chassis, boolean busy) {
		super();
		this.vehicleId = vehicleId;
		this.carrier = carrier;
		this.location = location;
		this.chassis = chassis;
		this.busy = busy;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public Carrier getCarrier() {
		return carrier;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Chassis getChassis() {
		return chassis;
	}

	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	}

	public boolean isBusy() {
		return busy;
	}

	public void setBusy(boolean busy) {
		this.busy = busy;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", carrier="
				+ carrier.getCarrierId() + ", location=" + location
				+ ", chassisOn=" + chassisOn + ", chassis=" + chassis
				+ ", busy=" + busy + "]";
	}

}
