package com.object;

public class C2 extends C1
{ 
	 double k;
	 C2()
	 {
		 
	 }
     C2(int i,int j,double k)
     {
    	 super(i,j);
    	 this.k=k;
     }
     public boolean equals(Object ob)
     {
    	 C2 temp=(C2)ob;
    	 return super.equals(ob) && this.k==temp.k;
    	 
     }
     
}
