package static_members;

public class p5 {
	static int x=10;
	public static void test1()
	{
		System.out.println("this is test1 class");
	}

	public static void main(String[] args)
	{
       int r=30;
       System.out.println(r);
       System.out.println(x);
       p5.test1();
	}

}
