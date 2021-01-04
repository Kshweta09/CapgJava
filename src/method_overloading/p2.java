package method_overloading;

public class p2 {
public static void main(int a,int b)
{
	int res=a+b;
	System.out.println("res="+res);
	char c='A';
	System.out.println("c="+c);
}
public static void main(char c)
{
	
	System.out.println(c);
}
public static void main(String str)
{
	
	System.out.println(str);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main(67,98);
		main("khadoos");
		

	}

}
