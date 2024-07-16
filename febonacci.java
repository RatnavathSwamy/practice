package com.practice.all;

public class febonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=6;int num1=0,num2=1,sum;
System.out.println("factorial is:"+num1);
for(int i=2;i<=n;i++)
{
	sum=num1+num2;
	num1=num2;
	num2=sum;
	System.out.println(sum);
}
	}

}
