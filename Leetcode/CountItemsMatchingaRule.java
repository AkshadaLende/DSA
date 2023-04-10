package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CountItemsMatchingaRule {

	public static <K> void iterateUsingForEach(List<List<String>> items, String ruleKey, String ruleValue) {

		
		int i = 0;
		int count = 0;
		String s = "";
		for (int j = 0; j < items.size(); j++) {

			if (ruleKey == "type") {
				System.out.println(items.get(j).get(0));
				s="";
				s = items.get(j).get(0);
				if (ruleValue.equals(s)) {
					count++;
				}

			} else if (ruleKey == "color") {
				s="";
				s = items.get(j).get(1);
				if (ruleValue.equals(s)) {
					count++;
				}
			} else {
				s="";
				s = items.get(j).get(2);
				if (ruleValue.equals(s)) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	
	public static void main(String[] args) {

		
		List<List<String>> listOfLists = new ArrayList<List<String>>();

		
		List<String> list1 = new LinkedList<String>();
		list1.add("phone");
		list1.add("blue");
		list1.add("pixel");
		listOfLists.add(list1);

		List<String> list2 = new LinkedList<String>();
		list2.add("comp");
		list2.add("silver");
		list2.add("lenevo");
		listOfLists.add(list2);

		List<String> list3 = new LinkedList<String>();
		list3.add("phone");
		list3.add("gold");
		list3.add("iphone");
		listOfLists.add(list3);
		String rulekey = "color";
		String rulevalue = "silver";
		
		iterateUsingForEach(listOfLists, rulekey, rulevalue);
	}
}
