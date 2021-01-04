package com.interface1;

public class AtmImplementation implements Atm
{
	int bal;

	@Override
	public void deposite(int d)
	{
		bal=bal+d;
	}

	@Override
	public void checkBal() 
	{
		System.out.println("bakance is ="+bal);
		
	}

	@Override
	public void withdraw(int w) 
	{
		if(w>bal)
		{
			System.out.println("Insufficient balance...");
		}
		else
		{
			System.out.println("Transaction successful...");
			bal=bal+w;
			checkBal();
		}
	}
      
}
