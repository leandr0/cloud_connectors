/**
 * 
 */
package fish.payara.cloud.connectors.kafka.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * @author digitallam
 *
 */
public class RandomGeneratorPlus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//double f = Math.random() / Math.nextDown(1.0);
		//double x = 1 * (1.0 - f) + 10 * f;
		// System.out.println(x);

		Random random = new Random();
		// System.out.println(random.nextInt(27)+1);

		Book evangelho = new Book();

		Charpter c01 = new Charpter(1, 11);
		evangelho.getCharpters().add(c01);

		Charpter c02 = new Charpter(2, 8);
		evangelho.getCharpters().add(c02);

		Charpter c03 = new Charpter(3, 19);
		evangelho.getCharpters().add(c03);

		Charpter c04 = new Charpter(4, 26);
		evangelho.getCharpters().add(c04);

		Charpter c05 = new Charpter(5, 31);
		evangelho.getCharpters().add(c05);

		Charpter c06 = new Charpter(6, 8);
		evangelho.getCharpters().add(c06);

		Charpter c07 = new Charpter(7, 13);
		evangelho.getCharpters().add(c07);

		Charpter c08 = new Charpter(8, 21);
		evangelho.getCharpters().add(c08);

		Charpter c09 = new Charpter(9, 10);
		evangelho.getCharpters().add(c09);

		Charpter c10 = new Charpter(10, 21);
		evangelho.getCharpters().add(c10);

		Charpter c11 = new Charpter(11, 15);
		evangelho.getCharpters().add(c11);

		Charpter c12 = new Charpter(12, 16);
		evangelho.getCharpters().add(c12);

		Charpter c13 = new Charpter(13, 20);
		evangelho.getCharpters().add(c13);

		Charpter c14 = new Charpter(14, 9);
		evangelho.getCharpters().add(c14);

		Charpter c15 = new Charpter(15, 10);
		evangelho.getCharpters().add(c15);

		Charpter c16 = new Charpter(16, 15);
		evangelho.getCharpters().add(c16);

		Charpter c17 = new Charpter(17, 11);
		evangelho.getCharpters().add(c17);

		Charpter c18 = new Charpter(18, 16);
		evangelho.getCharpters().add(c18);

		Charpter c19 = new Charpter(19, 12);
		evangelho.getCharpters().add(c19);

		Charpter c20 = new Charpter(20, 5);
		evangelho.getCharpters().add(c20);

		Charpter c21 = new Charpter(21, 11);
		evangelho.getCharpters().add(c21);

		Charpter c22 = new Charpter(22, 5);
		evangelho.getCharpters().add(c22);

		Charpter c23 = new Charpter(23, 18);
		evangelho.getCharpters().add(c23);

		Charpter c24 = new Charpter(24, 19);
		evangelho.getCharpters().add(c24);

		Charpter c25 = new Charpter(25, 11);
		evangelho.getCharpters().add(c25);

		Charpter c26 = new Charpter(26, 10);
		evangelho.getCharpters().add(c26);

		Charpter c27 = new Charpter(27, 23);
		evangelho.getCharpters().add(c27);

		int charpterNumber = random.nextInt(27) + 1;

		Charpter selectedCharpter = null;

		for (Charpter charp : evangelho.getCharpters()) {

			if (charp.getValue() == charpterNumber) {
				selectedCharpter = charp;
				break;
			}
		}

		int itemNumber = random.nextInt(selectedCharpter.getItems().size()) + 1;

		System.out.println("Capítulo : " + selectedCharpter.getValue());
		System.out.println("Item 	 : " + itemNumber);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);

		try {
			Writer output;

			final String FILE_PATH = "/Users/digitallam/workspace/src/Cloud-Connectors-master/Kafka/KafkaExample/evangelho_2022.txt";

			output = new BufferedWriter(new FileWriter(FILE_PATH,true)); // clears file every time
			output.append("Data     : " + date);
			output.append('\n');
			output.append("Capítulo : " + selectedCharpter.getValue());
			output.append('\n');
			output.append("Item 	 : " + itemNumber);
			output.append('\n');
			output.append('\n');
			output.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}