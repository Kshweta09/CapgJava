package com.object;

public class B 
{
    int i;
    char j;
	public B(int i,char j) 
	{
	    this.i=i;
	    this.j=j;
	}
	public boolean equals(Object ob)
	{
		B temp=(B)ob;
		return this.i==temp.i && this.j==temp.j ;
		
	}

}
//B->E2