package com.collection;

public class Pen
{
	int price;
	Pen()
	{
		
	}
	Pen(int price)
	{
		this.price=price;
	}
	@Override
	public String toString() {
		return "Pen [price=" + price + "]";
	}
	public boolean equals(Object ob)
	{
		Pen temp=(Pen)ob;
		return this.price==temp.price;
	}
    public int hashcode()
    {
    	int hc=0;
    	hc=hc+price;
    	return hc;
    }
}
//Pen->HS3