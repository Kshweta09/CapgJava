package com.interface1;

public class MainAtm {

	public static void main(String[] args) 
	{
		AtmImplementation a=new AtmImplementation();
		  a.deposite(1000);
		  a.checkBal();
		  a.withdraw(2000);
	}

}
