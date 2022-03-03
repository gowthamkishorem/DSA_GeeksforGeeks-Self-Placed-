/******************************************************************************
Trailing Zeros
*******************************************************************************/
import java.util.*;

public class Main
{

  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt ();

      System.out.println (sumofdigi (num));
  }
  
    public static int sumofdigi(int num)
    {
        
        if(num == 0)
        return 0;
        
        return sumofdigi(num/10) + (num % 10);
        
        
      
    }
  
  
/*  public static int sum (int num)
  {
    int result = 0;
    int digi = 0;
    while (num > 0)
      {
	digi = num % 10;
	result = result + digi;
	num = num / 10;
      }
    return result;
  } */
}
