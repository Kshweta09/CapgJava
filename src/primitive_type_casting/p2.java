//This pgm is for Narrowing in type-casting
package primitive_type_casting;

public class p2
{
   public static void main(String[] args)
   {
		int i=66;
		char c=(char)i;//narrowing
		System.out.println(c);
		
		System.out.println("--------------------------------------------------------------");
		double d1=65.01;
		double d2=65.99;
		char c1=(char)d1;//Explicitly
		char c2=(char)d2;
		System.out.println(c1);
		System.out.println(c2);


		double d3=75.0;
		float f1=(float)d3;
		System.out.println(f1);
				
		
		
}
}
