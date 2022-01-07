package chapter03;

public class VarDetail {
    // main方法
    public static void main(String[] args) {
        // 变量必须先声明，后使用，即有顺序
        int a = 20;
        System.out.println(a);
        // 变量在同一个类型范围内不断变化
        a = 88;
        System.out.println(a);
        // 该区域内只能定义赋值相同类型的变量，不能将string 类型 赋值给 int类型
        // a = "jack";

        // 变量在同一个作用域内不能重名。
        // int a = 4; x
    }
}

class Dog{
    public static void main(String[] args) {
        // 在不同的类中可以定义相同的变量，彼此不会影响
        int a = 30;
    }
}
