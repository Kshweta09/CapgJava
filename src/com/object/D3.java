package com.object;

public class D3  extends D2
{
   double d;
   D3()
   {
	   
   }
   D3(int i,char j,boolean f,String s,double d)
   {
	   super(i,j,f,s);
	   this.d=d;
   }
   public boolean equals(Object ob)
   {
	   D3 temp=(D3)ob;
	   return super.equals(ob) && this.d==temp.d;
   }
   public int hashcode()
   {
	   int hc=0;
	   hc=(int)d;
	   return super.hashcode()+hc;
   }
}
