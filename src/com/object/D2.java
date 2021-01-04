package com.object;

public class D2 extends D1
{
      boolean f;
      String s;
      D2()
      {
    	  
      }
      D2(int i,char j,boolean f,String s)
      {
    	  super(i,j);
    	  this.f=f;
    	  this.s=s;
    	  
    	  
      }
      public boolean equals(Object ob)
      {
    	  D2 temp=(D2)ob;
    	  return super.equals(ob) && this.f==temp.f  && this.s==temp.s;
    	  
    			 
      }
      public int hashcode()
      {
    	  int hc=0;
    	  if(f)
    		  hc=hc+1;
    	  else
    		  hc=hc+0;
    	  hc=hc+s.hashCode();
    	  return super.hashcode()+hc;
      }
}
