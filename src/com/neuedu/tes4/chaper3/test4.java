package com.neuedu.tes4.chaper3;

public abstract class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //四年一润，百年不润，400年再润
		
		int year = 2000;
		
		if(year%400 ==0)
		{
			System.out.println(year+"是闰年");
		}
		else
		{
			System.out.println(year+"不是闰年");
		}
	}

}
