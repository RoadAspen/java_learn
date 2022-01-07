package chapter03;

/**
 * 加法
 */
public class Plus {
    public static void main(String[] args) {
        // 数字和数字相加，执行的是 加法运算
        System.out.println(100 + 98);

        // 数字和字符串相加（有任意一方是字符串的情况）， 执行的是 拼接运算
        System.out.println(100 + "98");
    }
}
