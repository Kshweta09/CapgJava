package primitive_array;

public class p5 
{
    public static void display(int[] x)
    {
    	
    	for(int i=0;i<x.length;i++)
    	{
    		if(i%2==0)
    			System.out.println(x[i]);
    	}
    }
    public static void main(String[] args) 
    {
    	int a[]= {1,8,12,3,4};
    	display(a);
	
	}
}
