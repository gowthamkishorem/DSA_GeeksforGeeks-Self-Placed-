/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	static void toh(int n, char A, char B, char C)
	{
		if(n > 0)
			{
			    toh(n-1, A, C, B);
                System.out.println("move disc from " +A+ " to " +C);
                toh(n-1, B, A, C);
			  
			}
		

	}
    public static void main(String [] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of discs");
        int n = sc.nextInt();

    	toh(n, 'A', 'B', 'C');
    	System.out.println("Done");
        
    }
}
