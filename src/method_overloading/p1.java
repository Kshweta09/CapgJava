package method_overloading;

public class p1 
{
	public static void add(int x,int y)//method declaration (formal args)
	{
		int res=x+y;
		System.out.println("res="+res);
	}
	public static void add(int x,int y,int z)//method declaration (formal args)
	{
		int res=x+y+z;
		System.out.println("res="+res);

	}
 public static void main(String[] args) 
 {
	 add(10,20);
	 add(10,10,10);
	
}
	

}
