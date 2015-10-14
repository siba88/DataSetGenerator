import java.util.Random;

import model.Customer;
import model.Instance;
import model.Order;
import model.Task;
import model.TaskType;


public class OrderGenerator {
	
	Instance instance;
	Random rand;
	Order order;
	int taskCounter;
	int chassisNr;
	
	public OrderGenerator(Instance instance){
		this.instance=instance;
		rand = new Random();
		taskCounter=0;
	}

	public void loadOrders() {
		for(int i=1; i<=instance.getNrOrders(); i++){
			order = new Order(i);
			taskCounter=0;
			assignCarrier();
			initializeTasks();
		}
	}

	private void assignCarrier() {
		order.setCarrier(instance.getCarriers().get(rand.nextInt(instance.getNrCarriers()-1)));
	}
	
	private void initializeTasks() {
		initialTask();
		innerTask();
		innerTask2();
		finalTask();
		instance.addOrder(order);
		
	}

	private void initialTask() {
		Task task = new Task(order, ++taskCounter);
		int r = rand.nextInt(2);
		Customer c;
		//Choosing a customer
		if(r==0){
			chassisNr=rand.nextInt(instance.getChassis().size());
			//pickup from starting point
			c = instance.getChassis().get(chassisNr).getCustomer();
		}
		else{
			//pickup from customer
			c = instance.getChassisTemp().get(chassisNr).getCustomer();
		}
		task.setCustomer(c);
		//First task consists always of picking container
		task.setTaskType(TaskType.PICK);
		task.setPreconditionContainer(false);
		//Decide if picking empty or full container
		int r2 = rand.nextInt(2);
		if(r2==0){
			task.setPostconditionEmptyContainer(false);
		}
		else{
			task.setPostconditionEmptyContainer(true);
		}
		//choose random chassis
		task.setPreconditionChassis(true);
		task.setPreconditionChassisType(rand.nextInt(instance.getNrChassis())+1);
		order.addTask(task);
	}
	
	private void innerTask() {
		Task task = new Task(order, ++taskCounter);
		task.setTaskType(TaskType.DELIVER);
		task.setCustomer(instance.getCustomers().get(rand.nextInt(instance.getNrCustomers())+1));
		task.setPreconditionContainer(true);
		task.setPostconditionEmptyContainer(order.getTasks().get(taskCounter-2).isPreconditionEmptyContainer());
		task.setPreconditionChassis(true);
		task.setPreconditionChassisType(order.getTasks().get(taskCounter-2).getPreconditionChassisType());
		order.addTask(task);
	}
	
	private void innerTask2(){
		Task task = new Task(order, ++taskCounter);
		task.setTaskType(TaskType.PICK);
		task.setCustomer(order.getTasks().get(taskCounter-2).getCustomer());
		task.setPreconditionEmptyContainer(order.getTasks().get(taskCounter-2).isPreconditionEmptyContainer());
		task.setPostconditionEmptyContainer(!order.getTasks().get(taskCounter-2).isPreconditionEmptyContainer());
		task.setPreconditionChassis(true);
		task.setPreconditionChassisType(order.getTasks().get(taskCounter-2).getPreconditionChassisType());
		instance.getChassisTemp().get(chassisNr).setCustomer(task.getCustomer());
		order.addTask(task);
	}
	
	private void finalTask(){
		Task task = new Task(order, ++taskCounter);
		task.setTaskType(TaskType.DELIVER);
		task.setCustomer(instance.getCustomers().get(0));
		task.setPreconditionChassis(true);
		task.setPreconditionChassisType(order.getTasks().get(taskCounter-2).getPreconditionChassisType());
		task.setPreconditionEmptyContainer(order.getTasks().get(taskCounter-2).isPreconditionEmptyContainer());
		order.addTask(task);
		
	}
	

}
