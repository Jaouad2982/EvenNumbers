package evennumber;

public class EvenNumber {
	public static void main(String[] args) {

		evenNumber(0, 100);
	}

	public static void evenNumber(int i, int max) {
		for (i = 0; i <= max; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is an even number");
			} else {
				System.out.println(i);
			}
		}

	}
}
