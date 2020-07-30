package comn.neuedu.test;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /* \r回到行首
         * \n换行
         * 
         * \b退格
         * 
         * 0-9:十进制48(0是48 1是49···)
         * A-Z:十进制65
         * a-z:十进制97
         * *  
         */
		char a = 'a';
		char b = '中';
		char c = '\u9FA5';
		char e = '\t';
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(e);
	
			    System.out.println("escape\\bchar");
			    System.out.println("escape\\tchar");
			    System.out.println("escape\\rchar");
			    System.out.println("escape\\nchar");
			    System.out.println("\\我在斜线里\\");
			    System.out.println("\'我在单引号里\'");
			    System.out.println("\"我在双引号里\"");
			    System.out.println("我没有双引号");
			  
			    boolean flag = true;
			    boolean flag2 = false;
	}

}
