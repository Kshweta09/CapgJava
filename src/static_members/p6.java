// This is pgm is for Static-Intializer-Block
package static_members;

public class p6
{
	static int i=10;
	
	static 
	{
		System.out.println("from SIB-2");
		System.out.println(i);
	}
	static
	{
		System.out.println("from SIB-1");
		int i=100;
	}

	public static void main(String[] args) 
	{
      System.out.println("from main()");
	}
	

}
