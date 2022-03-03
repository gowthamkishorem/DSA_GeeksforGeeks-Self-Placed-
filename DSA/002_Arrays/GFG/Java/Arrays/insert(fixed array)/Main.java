/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int insert(int arr[], int size, int pos, int elt )
    {
        int index = (pos-1);
        for(int i = size-1; i>= index; i--)
        {
            arr[i] = arr[i-1];
        }
        
        arr[index] = elt;
        
        return size+1;
    }
        
    
	public static void main(String args[]) 
    { 
        
       int arr[] = new int[5], size = arr.length;

       arr[0] = 5; arr[1] = 10; arr[2] = 20;

       System.out.println("Before Insertion" + size);

       for(int i=0; i < size; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       int x = 7, pos = 2;
        
               System.out.println(size);

       size = insert(arr, size, x, pos);

       System.out.println("After Insertion");

       for(int i=0; i < size; i++)
       {
       		System.out.print(arr[i]+" ");
       } 
    } 
}
