package lianxi;

public class E2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //7.����ĳԱ���������н��30000Ԫ
		//����н����������6%����дһ��JavaӦ�ó�������Ա��10������н��
		//��ͳ��δ��10�꣨�ӽ������������롣
		
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
