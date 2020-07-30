package com.neuedu.tes4.chaper3;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //4%利息 10000存三年
		
		double sum = 10000;
		int i = 0;
		//i控制循环次数
		
		while(i<3)
		{
			sum*=(1+0.04);
			
			i++;
			
		}
		System.out.println(sum);
		
		
	}

}
