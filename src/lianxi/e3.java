package lianxi;

public class e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//11.�ж�һ�������Ƿ��ܱ�5��6ͬʱ��������ӡ�ܱ�5��6������
		//��ֻ�ܱ�5��������ӡ�ܱ�5������
		//��ֻ�ܱ�6����������ӡ�ܱ�6������
		//���ܱ�5��6����������ӡ���ܱ�5��6������
		 int a = 5;
		 int b = 6;
		 int i = 300;
		 
		 if(i%5==0 && i%6==0){
			 System.out.println("�ܱ�5��6����");
		 }
			 
		 else if(i%5==0)
		 {
			 System.out.println("�ܱ�5����");
		 }
		 else if(i%6==0)
				 {
			 System.out.println("�ܱ�6����");
				 }
		 
		 else if(i%6!=0 && i%5!=0)
		 {
			 System.out.println("���ܱ�5��6����");
		 }
		 
			 
		 
		 

	}

}
