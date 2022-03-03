/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int deleteEle(int arr[], int size, int elt)
    {
        int i = 0;
        for(i = 0; i< size; i++)
        {
            if (arr[i]== elt)
            break;
        }
        if(i == size)
        return size;
        
        for(int j = i; j < size - 1; j++)
        {
            arr[j] = arr[j+1];
        }
        
        return size-1;
    }
        
    
    public static void main(String args[]) 
    { 
       int arr[] = {3, 8, 12, 5, 6}, elt = 12, size = 5;

     

       System.out.println("Before Deletion");

       for(int i=0; i < size; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();
       

       size = deleteEle(arr, size, elt);

       System.out.println("After Deletion");

       for(int i=0; i < size; i++)
       {
       		System.out.print(arr[i]+" ");
       }
    } 
}
