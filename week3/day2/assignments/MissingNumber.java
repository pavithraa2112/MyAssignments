package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		
		num.add(7);
		num.add(5);
		num.add(3);
		num.add(1);
		num.add(3);
		num.add(2);
		num.add(8);
		num.add(1);
		num.add(3);
		num.add(3);
		num.add(6);
		num.add(8);
		num.add(8);
		
		System.out.println(num);
		
		Set<Integer>num1= new TreeSet<>(num);
		
		System.out.println(num1);
		
		//Object[] arr = num1.toArray();
		
		Integer[] a = num1.toArray(new Integer[0]);
		
		for(int i=0; i<a.length;i++)
		{
			if (a[i]!=i+1)
			{
				System.out.println(i+1);
				break;
				};
			
		}
		
		}
			
		
	}

