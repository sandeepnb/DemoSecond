package secondhigh;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccurChar {

	public static void main(String[] args) {

		String str = "Hello my dear how are you";

		LinkedHashSet<Character> hs = maxOccurChar(str);

		for (Character c : hs) {
			System.out.println(c);
		}

	}

	public static LinkedHashSet<Character> maxOccurChar(String str) {
		str = str.replaceAll(" ", "");

		char[] arr = str.toCharArray();

		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (map.get(arr[i]) != null) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else
				map.put(arr[i], 1);
		}

		int max = 0;
		Set<Entry<Character, Integer>> ent = map.entrySet();

		for (Entry<Character, Integer> entry : ent) {
			if (entry.getValue() > max) {
				max = entry.getValue();
			}
		}

		for (Entry<Character, Integer> entry : ent) {
			if (entry.getValue() == max) {
				hs.add(entry.getKey());
			}
		}
		return hs;
	}
}
