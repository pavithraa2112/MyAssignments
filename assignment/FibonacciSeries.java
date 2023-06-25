package week1.day1.assignment;


public class FibonacciSeries {
public static void main(String[] args) {
	int firstNum = 0;
	int secondNum = 1;
	int sum;
	
	//System.out.print(firstNum+",");
	
	for ( int i = 1; i <= 8; i++) {
		System.out.print(firstNum + ",");
		sum = firstNum + secondNum;
		firstNum=secondNum;
		secondNum=sum;
		
	}
}
}
