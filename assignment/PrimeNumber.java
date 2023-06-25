package week1.day1.assignment;

public class PrimeNumber {

	public static void main(String args[]){    
		  int i,m=0,flag=0;      
		  int n=13;  
		  m=n/2;      
 
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     //System.out.println(n+" is not prime number");      
		     flag=1;     
		    }   
		   }   
		   if(flag==0)
		   {
			   System.out.println(n+" is prime number");
		   }
		   else
		   {System.out.println(n+" is not a prime number");} 
		}    
		}   
	
