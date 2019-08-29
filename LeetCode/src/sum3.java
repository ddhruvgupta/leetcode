
/**
 * Author: Dhruv Gupta
 * 
 * Given an array nums of n integers, are there elements a, b, c in nums 
 * such that a + b + c = 0? 
 * 
 * Find all unique triplets in the array which gives the sum of zero.
 * 
 * Solution: 
 * 1) Sort Array - sorting is important because it results in information gain 
 * in terms of the ability to navigate the array based on the current sum
 * 
 * 2) Iterate through the array using 2 pointers to keep track of higher and
 *  lower values.
 *  
 *  3) Calculate sum of the values, if positive find a smaller / more neg num
 *  otherwise find lager number
 *  
 * 4) use hashmap to make sure all the combinations in the output are unique
 * 
 */

import java.util.*;

public class sum3 {
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> output = new LinkedList<>();
		HashSet<List<Integer>> one = new HashSet<>();

		int[] arr = nums;
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			int left = i - 1, right = i + 1;
			int num = arr[i];

			while (left >= 0 && right < arr.length) {
				int sum = num + arr[left] + arr[right];
				if (sum < 0)
					right++;
				if (sum > 0)
					left--;
				if (sum == 0) {
					List<Integer> out = new LinkedList<Integer>();
					out.add(arr[left]);
					out.add(arr[i]);
					out.add(arr[right]);
					one.add(out);
//						System.out.println(out.toString());
					left--;
				}
			}

		}

		for (List<Integer> ea : one)
			output.add(ea);
		return output;

	}

	public void test() {
//		int[] arr = {98,6,5,4,3,67, -2,-9};
		int[] arr = { -1, 0, 1, 2, -1, -4 };

		sum3.threeSum(arr);
	}
}
