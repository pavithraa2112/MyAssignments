package week3.day2.assignments;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();

		for(int i=0;i<=a.length-1;i++)
		{
			list1.add(a[i]);
		}

		for(int j=0;j<=b.length-1;j++)
		{
			list2.add(b[j]);
		}

		System.out.println(list1);
		System.out.println(list2);

		list2.retainAll(list1);
		System.out.println(list2);
	}
}
