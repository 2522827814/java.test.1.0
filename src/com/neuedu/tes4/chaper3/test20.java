package com.neuedu.tes4.chaper3;

public class test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //就两个数的最大公约数
		int m = 8;
		int n = 12;
		int result = 1;
		
		for(int i=1;i<=m;i++)
		{
			if(m%i==0 && n%i==0)
			{
				result= i;
			}
		}
		System.out.println(m+"和"+n+"的最大公约数为"+result);
			
	
	}

}




        /**
         * int m = 8;
         * int n = 12;
         * 
         * int min = m<n?m:n;
         * 
         * int result = min;
         * fou(int i = min; i>=1;i++)
         * {
         * if(m%i==0 && n&i==0)
         * {
         * 
         * }
         * }
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * */
         */