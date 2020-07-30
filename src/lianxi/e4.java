package lianxi;

public class e4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//13.输入一个0～100的分数，如果不是0～100之间，打印分数无效，根据分数等级打印A,B,C,D,E。
		
		int a = 88;
				if(a<=100 && a<=90)
				{
					System.out.println("A");
				}
				else if(a<90 && a>=80)
				{
					System.out.println("B");
				}
				else if(a<80 && a>=70)
				{
					System.out.println("C");
				}
				else if(a<70 && a>=60)
				{
					System.out.println("D");
				}
				else if(a<60)
				{
					System.out.println("E");
				}
				else
				{
					System.out.println("打印分数无效");
				}
	}

}
