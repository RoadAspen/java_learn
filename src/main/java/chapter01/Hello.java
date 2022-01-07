package chapter01;/*
	这是java 的快速入门，演示 java 的开发步骤

 */

// 对代码的相关说明
// 1. publish class Hello 表示 Hello是一个类，是一个public 的公有类
// 2. Hello{} 表示一个类的开始和结束
// 3. public static void main(String[] args) 表示一个主方法，即我们程序的入口
// 4. main(){} 表示主方法的开始和结束
// 5.System.out.println("结果="+ar); 表示输出结果到屏幕
// 6. ; 表示语句结束。

// java 执行，就是先 javac 编译，然后 执行。 文件有中文时需要 utf-8 编码
public class Hello {

	// 编写一个main方法
    public static void main(String[] args){
        int ar = 1 + 1 + 1;
        System.out.println("结果="+ar);
    }
}

// 一个源文件最多只能有一个public类，其他类的个数不限
// Dog是一个类, 如果添加public ，编译会报错， Dog 必须在 Dog.java 文件中
// public class Dog{

// }
// 不加public 就是正常的, 此时编译会生成一个Dog.class 文件
class Dog{
	// 可以讲main方法写在非public的类
	public static void main(String[] args){
		System.out.println("Dog");
	}

}