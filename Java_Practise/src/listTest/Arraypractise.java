package listTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Arraypractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list= new ArrayList<>();
		list.add("prashanth");
		list.add("reddy");
		
		list.add(0,"BAKARAPU");
		
		list.add(2,"Rekha");
		
		list.set(1, "kps");
		
		
		list.remove(0);
		//list.clear();
		System.out.println(list);
		System.out.println(list.get(2));
		
		
		List<String> li= new LinkedList<>();
		li.addAll(list);
		System.out.println(li);
		
	}

}
