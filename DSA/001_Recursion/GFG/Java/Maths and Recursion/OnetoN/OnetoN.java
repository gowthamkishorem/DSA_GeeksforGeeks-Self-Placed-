import java.util.*;

class OnetoN
{

	
	static void OnetoN(int n)
	{
		if(n == 0)
			return;
		
		OnetoN(n - 1);

		System.out.print(n+" ");

	}
    public static void main(String [] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    	OnetoN(n);
        
    }

}
