/******************************************************************************
Trailing Zeros
*******************************************************************************/
import java.util.*;

public class trailingzeroesinfact
{

  public static void main (String[]args)
  {

    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt ();

      System.out.println (trailzeros (num));
  }
  public static int trailzeros (int num)
  {
    int result = 0;

    for (int i = 5; i <= num; i = i * 5)
      {
	result = result + (num / i);
      }

    return result;
  }
}
