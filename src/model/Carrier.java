package model;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "carrier")
@XmlAccessorType (XmlAccessType.FIELD)
public class Carrier {
	
	private int carrierId;
	private String name;
	
	public Carrier() {
		super();
	}

	public Carrier(int carrierId, String name) {
		super();
		this.carrierId = carrierId;
		this.name = name;
	}

	public int getCarrierId() {
		return carrierId;
	}

	public void setCarrierId(int carrierId) {
		this.carrierId = carrierId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Carrier[carrierId=" + carrierId + ", name=" + name + "]";
	}
	
	

}
