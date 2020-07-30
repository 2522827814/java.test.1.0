package comn.neuedu.test;

/**
 *  这是一个测试类
 *  
 *  @author 撒点开了；
 *  @version
 *  一个.java文件中可以有多个class，但是只能有一个public修饰的
              文件名跟public的类名一样    
 *  2.只有public类中才能有main入口方法
 *  3.如果文件中没有public的类，文件名要跟其中一个类的名字相同
 * 
 * 
 * 
 * */

public class Helloclass {
	
	/**
	 * 这是主方法
	 * @param 参数什么含义
	 * @return返回值什么含义
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		//这是单行注释
		/*
		 * 
		 * 这是多行注shi
		 * 
		 * */
		//声明变量
		int a;
		
		//赋值
		a=10;
		
		//声明变量，赋初值
		int b = 20;
		
		b = 30;
		
		b = 50;
		
		System.out.println(b);
		
		//声明小数（double）
		double x = 12.34;
		double y = 15.6789;
		
		//声明字符串类型
		String str = "haha";
		str = "hehe";
		
		System.out.println(x);
		System.out.println("haha");
		
		//设置常量
		final double pi = 3.14;
				
	    
		;
		
		 
		System.out.println("Hello World");
		System.out.println("Hello china");
		
	}

}