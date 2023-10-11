package fish.payara.cloud.connectors.kafka.example;

import java.util.Collection;
import java.util.LinkedList;

public class Charpter {

	private Collection<Item> items;

	private int value;
	
	private Charpter() {}
	
	public Charpter(Collection<Item> items) {
		this.items = items;
	}
	
	public Charpter(final int value,final int itemSize) {
		
		if(itemSize < 1 || value < 1)
			throw new IllegalArgumentException("The size must be > 0"); 
		
		this.value = value;
		
		items = new LinkedList<Item>();
		
		for(int i = 1 ; i <= itemSize; i++ ) {
			items.add(new Item(i));
		}
	}
	
	
	public Collection<Item> getItems() {
		return items;
	}

	public void setItems(Collection<Item> items) {
		this.items = items;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}