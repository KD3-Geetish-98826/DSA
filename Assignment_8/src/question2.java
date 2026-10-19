import java.util.HashMap;
import java.util.Map;

public class question2 {

	public static int findMode(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		int mode = arr[0];
		int maxCount = 0;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				mode = entry.getKey();
			}
		}

		return mode;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 4, 2, 3 };

		System.out.println("Mode: " + findMode(arr));
	}
}