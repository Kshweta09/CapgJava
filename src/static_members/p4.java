package static_members;

public class p4 {
	static int i=30;//global static variable

	public static void main(String[] args)
	{
		int i=200;
		System.out.println(i);
		System.out.println(p4.i);
		System.out.println(p3.i);
		test();
        
	}
	public static void test()
	{
		System.out.println(i);
	}

}
