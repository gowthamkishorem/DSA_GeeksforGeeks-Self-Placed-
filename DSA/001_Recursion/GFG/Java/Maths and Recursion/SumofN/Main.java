class Main
{


  static int SumofN(int n)
  {
    if (n == 0)
      return 0;

    return n + SumofN(n - 1);

  }
  public static void main(String[]args)
  {
    int n = 8;

    System.out.println(SumofN (n));

  }

}
