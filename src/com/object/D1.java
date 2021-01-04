package com.object;

public class D1 
{
    int i;
    char j;
    D1()
    {
    	
    }
    D1(int i,char j)
    {
    	this.i=i;
    	this.j=j;
    }
    public boolean equals(Object ob)
    {
    	return this.i==((D1)ob).i && this.j==((D1)ob).j;
    }
    public int hashcode()
    {
    	int hc=i+j;
    	return hc;
    	
    }
}
//D1->D2=>D3E5
