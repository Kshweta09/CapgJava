package com.object;

public class C1 
{
    int i;
    int j;
    C1()
    {
    	
    }
    C1(int i,int j)
    {
    	this.i=i;
    	this.j=j;
    }
    public boolean equals(Object ob)
    {
    	C1 temp=(C1)ob;
    	return this.i==temp.i && this.j==temp.j;
    }
}

//c1->c2->E4