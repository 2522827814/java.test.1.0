package comn.neuedu.test;

public class test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。
		
		int a,b,c;
		
		a = 100;
		b = 200;
		
		c = a;//c = 100
		a = b;//a=200
		b = c;//b=100
		
		
		
		
		System.out.println(a);
		System.out.println(b);
		
		//2.给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。
		
		int d,e,f,g;
		
		d = 987;
		e = d/100;
		f = d/10%10;
		g = d%10;
		
		System.out.println(e+f+g);
				
		
		
				
		
		
		
		
		
		

	}

}
