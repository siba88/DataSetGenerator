package model;

import java.util.ArrayList;

public class Order {
	
	private int orderId;
	private Carrier carrier;
	
	private ArrayList<Task> tasks;
	
	public Order(int orderId){
		this.orderId=orderId;
		tasks=new ArrayList<Task>();
	}

	public Carrier getCarrier() {
		return carrier;
	}

	public void setCarrier(Carrier carrier) {
		this.carrier = carrier;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	
	public void addTask(Task task){
		this.tasks.add(task);
	}

	@Override
	public String toString() {
		return "\nOrder [orderId=" + orderId + ", carrier=" + carrier.getName()
				+ ", tasks=" + tasks.toString() + "]";
	}
	
	

}
