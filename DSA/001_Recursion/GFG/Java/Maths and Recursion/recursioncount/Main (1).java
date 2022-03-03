/******************************************************************************

Count Using Recursion

*******************************************************************************/
import java.util.Scanner;


public class Main
{
	public static void main(String[] args) {
	    
	    System.out.println("Enter an Integer");
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		System.out.println("number of digits is "+ count(n) );
		
	
	
	}
	
	public static int count(int n)
{
    if(n==0)
    {
        return 0;
    }
    return 1 + count(n/10);
}
}

