//This pgm is to store odd numbers ehich are
package primitive_array;

public class p4
{

	public static void main(String[] args) 
	{
       int a[]=new int[5];
       for(int i=0,j=1;i<a.length;j++)
		{
			if(j%2!=0 && j%5==0 )
			{   a[i]=j;
				System.out.println("a["+i+"] is "+a[i++]);
			}


      
	    }
	}
}
