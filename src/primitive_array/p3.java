//Pgm is to store numbers which are divisible by 2 in an array

package primitive_array;

public class p3
{
	public static void main(String[] args) 
	{
		int [] a=new int[3];
		for(int i=0,j=1;i<a.length;j++)
		{
			if(j%2==0)
			{   a[i]=j;
				System.out.println("value at"  +i+ "th index is:" +a[i++]);
			}
			
		}
}
}