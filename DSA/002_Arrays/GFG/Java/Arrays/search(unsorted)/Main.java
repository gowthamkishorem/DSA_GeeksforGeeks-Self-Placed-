/******************************************************************************

                            Operations on Array Part-1

*******************************************************************************/
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
  public static int search (int arr[], int n, int x)
  {
    for (int i = 0; i < n; i++)
      {
	if (arr[i] == x)
	  {
	    System.out.println ("element present at index " + i);
	  }
      }
    return -1;
  }
  public static void main (String[]args)
  {
    int arr[] = { 20, 5, 7, 25 }, x = 7;
    search (arr, arr.length, x);
  }
}
