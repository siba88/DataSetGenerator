package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "task")
@XmlAccessorType(XmlAccessType.FIELD)
public class Task {
	
	@XmlTransient
	private Order order;
	private int taskId;
	private Customer customer;
	private boolean preconditionContainer;
	private boolean preconditionEmptyContainer;
	private boolean postconditionEmptyContainer;
	private boolean preconditionChassis;
	private int preconditionChassisType;
	private TaskType taskType;

	public Task() {
		super();
	}

	public Task(Order order, int taskId) {
		super();
		this.order = order;
		this.taskId = taskId;
	}

	public Task(Order order, int taskId, Customer customer,
			boolean preconditionContainer, boolean preconditionChassis) {
		super();
		this.order = order;
		this.taskId = taskId;
		this.customer = customer;
		this.preconditionContainer = preconditionContainer;
		this.preconditionChassis = preconditionChassis;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public boolean isPreconditionContainer() {
		return preconditionContainer;
	}

	public void setPreconditionContainer(boolean preconditionContainer) {
		this.preconditionContainer = preconditionContainer;
	}

	public boolean isPreconditionEmptyContainer() {
		return preconditionEmptyContainer;
	}

	public void setPreconditionEmptyContainer(boolean preconditionEmptyContainer) {
		this.preconditionEmptyContainer = preconditionEmptyContainer;
	}

	public boolean isPostconditionEmptyContainer() {
		return postconditionEmptyContainer;
	}

	public void setPostconditionEmptyContainer(
			boolean postconditionEmptyContainer) {
		this.postconditionEmptyContainer = postconditionEmptyContainer;
	}

	public boolean isPreconditionChassis() {
		return preconditionChassis;
	}

	public void setPreconditionChassis(boolean preconditionChassis) {
		this.preconditionChassis = preconditionChassis;
	}

	public int getPreconditionChassisType() {
		return preconditionChassisType;
	}

	public void setPreconditionChassisType(int preconditionChassisType) {
		this.preconditionChassisType = preconditionChassisType;
	}

	public TaskType getTaskType() {
		return taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", customer="
				+ customer.getCustomer_id() + ", preconditionContainer="
				+ preconditionContainer + ", preconditionEmptyContainer="
				+ preconditionEmptyContainer + ", postconditionEmptyContainer="
				+ postconditionEmptyContainer + ", preconditionChassis="
				+ preconditionChassis + ", preconditionChassisType="
				+ preconditionChassisType + ", taskType=" + taskType.toString()
				+ "]";
	}

}
