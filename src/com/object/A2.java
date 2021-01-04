package com.object;

public class A2 extends A1
{
  int j;
  public String toString()
  {
	  return "i=" + i +" and   j="  +j;
  }
  public static void main(String[] args)
  {
	A2 ob=new A2();
	ob.i=20;
	ob.j=30;
	//System.out.println(ob.i);
	//System.out.println(ob.j);
	System.out.println(ob);

}
}
