package array;

import java.util.HashMap;
import java.util.Map;

public class value {

	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (K key : map.keySet()) {
			if (value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		Map<String, Integer> h = new HashMap();
		h.put("A", 1);
		h.put("B", 2);
		h.put("C", 3);

		System.out.println(getKey(h, 4));
	}
}
