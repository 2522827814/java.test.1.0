package com.neuedu.tes4.chaper3;

public class test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //
		int num = 9;
		
		//boolean flag = true;//������
		//for(int i=2;i<=num-1;i++)
		int i = 2;
		for(;i<=num-1;i++)
		{
			if(num%i==0)
			{
				//������
				//flag = false��//��������
				System.out.println("��������");
				break;
			}
		}
		//if��flag��//һ����û����
		if(i==num)
		{
			//break�����
		System.out.println("������");
		}
	}

}
