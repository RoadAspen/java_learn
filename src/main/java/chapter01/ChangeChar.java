package chapter01;// 演示转义字符的使用

public class ChangeChar{
	// 编写一个main方法
	public static void main(String[] args) {
		// \t ：制表符，实现对齐的功能
		System.out.println("北京\t天津\t上海");
		// \n ：换行符
		System.out.println("北京\n天津\n上海");
		// \\ ：转义字符本身
		System.out.println("北京\\天津\\上海");
		// \" ：转义双引号
		System.out.println("北京\"天津\"上海");
		// \' ：转义单引号
		System.out.println("北京\'天津\'上海");
		// \r ：回车,会回到行首，把回车符定位到第一个字符，并用后边的字符替换之后的字符
		System.out.println("北京天津\r上海12");
		// \rn ：回车换行,换行并回到行首
		System.out.println("北京天津\r\n上海12");


		// 课堂练习
		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
	}
}