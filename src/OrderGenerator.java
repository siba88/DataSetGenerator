import java.util.Random;

import model.Instance;
import model.Order;
import model.Task;


public class OrderGenerator {
	
	Instance instance;
	Random rand;
	Order order;
	int taskCounter;
	
	public OrderGenerator(Instance instance){
		this.instance=instance;
		rand = new Random();
		taskCounter=0;
		loadOrders();
	}

	private void loadOrders() {
		for(int i=1; i<=instance.getNrOrders(); i++){
			order = new Order(i);
			assignCarrier();
			initializeTasks();
		}
	}

	private void assignCarrier() {
		order.setCarrier(instance.getCarriers().get(rand.nextInt(instance.getNrCarriers()-1)));
	}
	
	private void initializeTasks() {
		initialTask();
		
	}

	private void initialTask() {
		taskCounter++;
		Task task = new Task(order, taskCounter);
	}
	
	

}
