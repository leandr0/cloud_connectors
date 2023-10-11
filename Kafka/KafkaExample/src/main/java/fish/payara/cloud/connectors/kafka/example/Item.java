package fish.payara.cloud.connectors.kafka.example;

public class Item {

	private int value;

	private Item() {}
	
	public Item(final int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
