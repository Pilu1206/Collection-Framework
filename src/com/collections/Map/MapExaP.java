package com.collections.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SuppressWarnings("unused")
public class MapExaP {

	public static void main(String[] args) {
		// create object for map using key and values
		Map<Integer, String> map = new HashMap<>();
		// create map employee id and name
		map.put(101, "vijay");
		map.put(102, "kajal");
		map.put(103, "faruk");
		map.put(104, "gauri");

		// size of map
		System.out.println("Map is :" + map.size());

		// to get the particular value
		System.out.println(map.get(101)); // Vijay
		System.out.println(map.get(200));

		// to get the collection of values then use : map.values()
		Collection<String> values = map.values();

		for (String v : values) {
			System.out.println(v);

		}

		// if you won't find only keys then use :map.keySet()
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println(key);
			System.out.println(map.get(key));

			// if we won't find all key and values then use :map.entrySet();

			//Set<Entry<Integer, String>> entrySet = map.entrySet();
			/*
			 * Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
			 * while(iterator.hasNext()) { Entry<Integer, String> entry = iterator.next();
			 * System.out.println(entry.getKey()+"---"+entry.getValue());
			 */

		}
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		// for each lopp get the all values form map
		for (Entry<Integer, String> entry1 : entrySet) {
			System.out.println(entry1.getKey() + "--" + entry1.getValue());

		}
		// contains values and key from map
		System.out.println(map.containsKey(105));
		System.out.println(map.containsKey(103));
		System.out.println(map.containsValue("vijay"));
		System.out.println(map);

		// remove the all elements from map
		map.clear();
		System.out.println(map.size());

	}

}
