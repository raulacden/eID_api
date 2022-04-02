package rsp.eid.api.utils;

import java.util.List;

public class Utils {

	/**
	 * Calculate the biggest difference between the smallest value and the greatest
	 * value from the input list
	 * 
	 * @param list values to be analyzed
	 * @return finalValue
	 */
	public static int calculateBiggestDifference(List<Integer> list) {

		int finalValue = 0;

		if (list.size() > 1) {
			int minValue = list.get(0);
			for (int i = 1; i < list.size(); i++) {
				int diff = list.get(i) - minValue;

				if (diff > finalValue) {
					finalValue = diff;
				}
				if (list.get(i) < minValue) {
					minValue = list.get(i);
				}
			}
		}

		return finalValue;
	}
}
