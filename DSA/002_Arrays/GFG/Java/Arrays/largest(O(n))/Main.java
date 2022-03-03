/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int largest(int arr[])
    {
        int i = 0;
        int index = 0;
        for(i = 0; i< arr.length; i++)
        {
            if (arr[i] >arr[index])
            index = i;
        }
        return index;
        
        }
        
    
    public static void main(String args[]) 
    { 
       int arr[] = {3, 98, 12, 5, 150};


       System.out.println(largest(arr));

    } 
}
