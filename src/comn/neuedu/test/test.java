package comn.neuedu.test;

public abstract class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //ʮ����
		int a = 10 ;
		
		//ʮ������
		
		int b = 0x10;//16
		
		//�˽���
		int c = 010;//8
		
		//������
		int d = 0B100;//4
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//���ƻ�ת
		//ʮ����   ��ʮ�����ˣ������̳�����
		//ʮ�����ˣ���=��ʮ���ƣ�Ȩ�ӷ���
		//ʮ�����ƣ��˽��ơ�-��������
		
		//ʮ����ת����������
		System.out.println(Integer.toBinaryString(100));
	}

}
