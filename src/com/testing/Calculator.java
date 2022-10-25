package com.testing;

public class Calculator 
{
	Calculator()
	{
		System.out.println("Hii!!!!"); // 4 times hii cuz separate test cases have separate life cycle 
	}
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int dif(int a, int b)
	{
		return a-b;
	}
	
	public int mul(int a, int b) 
	{
		return a*b;
	}
	public int div(int a, int b) 
	{
		return a/b;
	}
	

}
