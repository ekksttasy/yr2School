import java.util.Arrays;

/**
 * Stats class used to analyze a list of values.
 * 
 */
public class Stats {
	/**
	 * 'numbers' array is used to store values to be analyzed
	 * 
	 * uses 'public' modifier for values to be easily replaced.
	 */
	public int[] numbers;
	/**
	 * Count is the number of values stored in 'numbers'. 
	 * Used to add new values to the numbers array.
	 */
	private int count;

	/**
	 * addValue method to append new values to existing numbers array.
	 * 
	 * uses 'public' modifier for values to be easily replaced.
	 */
	public void addValue(int value) {
		numbers[count] = value;
		count++;
	}
	
	/**
	 * getCount method to find total number of values in array
	 * @return length of array
	 */
	public int getLength() {
		return numbers.length;
	}

	/**
	 * getMax method finds largest value in array
	 * @return maximum (largest) value
	 */
	public int getMax() {

		int max = numbers[0];	

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max)max = numbers[i];		}

				return max;
		}
	
	/**
	 * getMin method finds smallest value in array
	 * @return minimum (smallest) value
	 */
	public int getMin() {int min = numbers[0]; 

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] < min)
				min = numbers[i];
		}

		return min;
	}
	
	/**
	 * getTotal method adds all values together
	 * @return sum of all values in array
	 */
	public int getTotal() {
		
		int total = 0;
		
		// total all values within the array
		for (int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}		
		return total;
	}
	
	/**
	 * getAverage method finds average value from all values in array
	 * @return average of array
	 */
	public double getAverage() {
		
		int x = 0;
		for (int i = 0; i < numbers.length; i++) {
			x += numbers[i];
		}
		
		double y = x/(double)numbers.length;
		
		return y;
	}

	@Override
	public String toString() {
		return Arrays.toString(numbers);
	}
	

	public Stats(int capacity) {
		numbers = new int[capacity];
	}
	
	
	
	
	
	
}
