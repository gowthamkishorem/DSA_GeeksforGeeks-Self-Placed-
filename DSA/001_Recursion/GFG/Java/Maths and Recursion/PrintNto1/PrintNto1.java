import java.util.Scanner;

public class PrintNto1
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt ();
      System.out.println (nto1 (n));
  }

  public static int nto1 (int n)
  {
    if (n == 1)
      return 1;
    System.out.println (n);
    return (nto1 (n - 1));
  }
}
