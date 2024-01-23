
public class Solution {

	public static int[] twoSum(int[] numbers, int target) {
		
		int index[] = new int[2];
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					index[0] = i;
					index[1] = j;
				}
			}
		}
		
		return index;
	}
	
	public static void main(String[] args) {
		
		int sum[] = twoSum(new int[]{3, 2, 3}, 6);
		
		for (int values: sum) {
			System.out.println(values);
		}
		
	}
}
