/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
  static boolean isPalindrome (String str, int start, int end)
  {
    if (start >= end)
      return true;

    return ((str.charAt (start) == str.charAt (end)) &&
	    isPalindrome (str, start + 1, end - 1));
  }
  public static void main (String[]args)
  {
    String s = "MalayalaM";

    System.out.println (isPalindrome (s, 0, s.length () - 1));
  }
}
