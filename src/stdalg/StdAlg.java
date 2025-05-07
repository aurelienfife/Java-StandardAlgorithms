package stdalg;

public class StdAlg {

	// Global: some data used in the algorithms
	int[] scores = { 45, 12, 70, 25, 39, 55, 64, 22, 7, 56 };
	String[] fruits = { "apple", "orange", "apple", "banana", "cherry", "orange", "apple" };

	public void run() {
		findMin();
		findMax();
		countOccurrences("apple");
		countOccurrences("kiwi");
	}

	private void findMin() {

		// - we assume the first element is the smallest,
		// and revise it if going through the list shows otherwise
		int minValue = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] < minValue) {
				minValue = scores[i];
			}
		}
		System.out.println(scores.toString());
		System.out.println("The minimum is: " + minValue);
	}

	private void findMax() {
		// Same principle but we invert the comparison operator
		int maxValue = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > maxValue) {
				maxValue = scores[i];
			}
		}
		System.out.println(scores.toString());
		System.out.println("The maximum is: " + maxValue);
	}

	private void countOccurrences(String term) {
		// Similar to a linear search, except each match
		// increases a counter, whereas a search would end and return
		// the position
		int count = 0;
		for (String item : fruits) {
			if (item.equals(term)) {
				count++;
			}
		}

		System.out.println(fruits.toString());
		System.out.print(term);
		System.out.println(count + " occurrence(s).");
	}
}
