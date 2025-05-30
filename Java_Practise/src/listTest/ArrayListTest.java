package listTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li= new ArrayList<>();
		
		List<Integer> op= new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(60);
		li.add(99);
		li.add(9);
		li.add(99);
		
		System.out.println(li);
		for(int res:li)
		{
			//System.out.println(res);
			
			if(res<10 || res>60)
			{
				op.add(res);
			}
			
		}
		 System.out.println(op);
		 
		 List<Integer> opt= Arrays.asList(20,45,53,77,89,90,90);
		 System.out.println(opt);
		 List<Integer> op1= new ArrayList<>();
			op1=opt.stream().filter(n->n>=45 && n<=77).collect(Collectors.toList());
			
			System.out.println(op1);
			
			List<String> li4= new ArrayList<>();
			li4.add("prashanth");
			li4.add("ram");
			li4.add("venkatest");
			li4.add("apple");
			System.out.println(li4);
			
			List<String> li5= new LinkedList<>();
			li5.add("prashanth");
			li5.add("ram");
			li5.add("venkatest");
			li5.add("apple");
			System.out.println(li4);
			
			List<Integer> li6= new LinkedList<>();
			li6.add(100);
			li6.add(70);
			li6.add(10);
			li6.add(6);
			li6.add(190);
			System.out.println(li6);
			
			List<Integer> li7= new Vector<>();
			li7.add(170);
			li7.add(100);
			li7.add(90);
			li7.add(500);
			System.out.println(li7);
			
		 
	}
	}
