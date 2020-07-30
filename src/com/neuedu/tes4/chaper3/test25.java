package com.neuedu.tes4.chaper3;

import java.util.Scanner;

public class test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a = 120;
        /*System.out.println("ÇëÊäÈëÊı×Ö:");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        System.out.print(a+"=");*/
         
        for(int i=2;i<=a;i++)
        {
        	while(a!=i)
        	{
        		if(a%i==0)
        		{
        			System.out.print(i+"*");
        			a=a/i;
        		}
        		else
        		{
        			break;
        		}
        	}
        }
        System.out.print(a);
	}

}
        /* int a = 120;
       for(int i=2;i<=a;i++)
       {
    	 while(a!=i)
    	 {
    		 if(a%i==0)
    		 {
    			 System.out.print(i+"*");
    			 a=a/i;
    		 }
    		 else
    		 {
    			 break;
    		 }
    	 }
       }
       System.out.println(a);
       }
       
    	   
       }*/