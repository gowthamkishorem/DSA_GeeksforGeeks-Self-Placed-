/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{

  public static int sumofnusingrec (int num)
  {
    if (num == 0)
      return 0;adasdasdas
    return num + sumofnusingrec (num - 1);

  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int num = sc.nextInt ();
    System.out.println (sumofnusingrec (num));
  }
}
