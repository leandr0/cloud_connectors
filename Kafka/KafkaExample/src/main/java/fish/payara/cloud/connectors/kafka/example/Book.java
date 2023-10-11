package fish.payara.cloud.connectors.kafka.example;

import java.util.Collection;
import java.util.LinkedList;

public class Book {

	
	private Collection<Charpter> charpters;
	
	public Book() {
		this.charpters = new LinkedList<Charpter>();
	}
	
	public Book(Collection<Charpter> charpters) {
		this.charpters = charpters;
	}

	public Collection<Charpter> getCharpters() {
		return charpters;
	}

	public void setCharpters(Collection<Charpter> charpters) {
		this.charpters = charpters;
	}
}