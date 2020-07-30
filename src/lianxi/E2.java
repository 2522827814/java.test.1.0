package lianxi;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //7.假设某员工今年的年薪是30000元
		//，年薪的年增长率6%。编写一个Java应用程序计算该员工10年后的年薪，
		//并统计未来10年（从今年算起）总收入。
		
		double a = 30000;
		double sum = 0;
		for(int i=1;i<=10;i++)
		{
			a=a*(1+0.06);
			sum=sum+a;
		  
		}
		System.out.println(a);
		System.out.println(sum);
	}

}
