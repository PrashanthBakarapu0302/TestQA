package com.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map= new HashMap<>();
		map.put(1,"prashanth");
		map.put(2, "rajesh");
		map.put(3, "apple");
		//Iterator over the map using entryset
		
	for(Map.Entry<Integer, String>entry:map.entrySet())
	{
		Integer keys=entry.getKey();
		String values=entry.getValue();
		System.out.println(keys+" "+values);
	}
		
		
		System.out.println(map.get(1));
		System.out.println(map);
		System.out.println(map.values());
		System.out.println(map.containsKey(3));
		System.out.println(map.containsValue("rajesh"));
		
		map.put(3, "ball");
		map.put(4, "ball");
		map.put(null, null);
		map.put(null, "PR");
		map.put(null, "RT");
		
		
		System.out.println(map);
		
		Map<String,Integer> maps1=new LinkedHashMap<>();
		
		maps1.put("prashanth", 1);
		maps1.put("rekha", 2);
		maps1.put("nirvi", 3);
		maps1.put("b.vihaan",4);
		System.out.println(maps1);
		
	Map<String,Integer> maps2=new TreeMap<>();
		
		maps2.put("prashanth", 1);
		maps2.put("rekha", 2);
		maps2.put("nirvi", 4);
		maps2.put("b.vihaan",3);
		System.out.println(maps2);

	}

}
