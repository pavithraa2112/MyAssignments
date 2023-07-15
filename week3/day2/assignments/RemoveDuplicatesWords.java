package week3.day2.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] str = text.split(" ");
		
		Set<String> set = new LinkedHashSet<>(Arrays.asList(str));
		
		
			String arr[] = set.toArray(new String[0]);
			
			for(int i=0; i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		
			
	}
}
