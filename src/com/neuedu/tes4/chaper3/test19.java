package com.neuedu.tes4.chaper3;

public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //
		int num = 9;
		
		//boolean flag = true;//是质数
		//for(int i=2;i<=num-1;i++)
		int i = 2;
		for(;i<=num-1;i++)
		{
			if(num%i==0)
			{
				//整除了
				//flag = false；//不是质数
				System.out.println("不是质数");
				break;
			}
		}
		//if（flag）//一个都没整除
		if(i==num)
		{
			//break到这个
		System.out.println("是质数");
		}
	}

}
