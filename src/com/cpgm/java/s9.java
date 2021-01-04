package com.cpgm.java;

public class s9
{
		public static void test(int n)
		{
			if(n==0)
			{
				//System.out.println(n);
				return;
			}
			System.out.println(n);
			test(--n);
			System.out.println(n);

		}

		public static void main(String[] args) {
			int n=100;
			test(n);
			System.out.println(n);
			// TODO Auto-generated method stub

		}


	}


