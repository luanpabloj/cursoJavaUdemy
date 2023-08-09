package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


	private Date moment;
	private OrderStatus status;
	
	private Client client;

	List<OrderItem> items = new ArrayList<OrderItem>();

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;

	}


	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double soma = 0;
		
		for(OrderItem it : items) {
			soma+= it.subTotal();
		}
		
		return soma;
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: ");
		sb.append("\nOrder moment: " + fmt1.format(moment));
		sb.append("\nOrder status: " + status);
		sb.append(client);
		sb.append("\nOrder items:");
		sb.append(items.toString());
		sb.append("\nTotal price: " + total());
		
		return sb.toString();
				
		
	}
}
