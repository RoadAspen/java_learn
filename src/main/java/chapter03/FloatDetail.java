package chapter03;

/**
 * 浮点型
 */
public class FloatDetail {
    public static void main(String[] args) {
        /**
         * java 的 浮点型常量 默认为 double 型， 声明 float类型， 4字节， 须后加 f 或者 F
         * eg： float n = 1.5f;
         * 如果不加 f， 就是 double 类型  8 字节
         */
        float n = 1.5f;
       // float n_d = 1.6;  error

        /**
         *  double 类型,可以将float 类型赋给 double 类型， 不足为补 0
         */
        double n_d = 1.5f;

        /**
         * 通常情况下，应该使用double类型，因为他比float类型更精确。
         */
        double a = 2.13123123121241414;
        float b = 2.13123123121241414F;
        // 输出 2.13123123121241414
        System.out.println(a);
        // 输出 2.1312313， 后边就省略了
        System.out.println(b);

        /**
         * 浮点数使用陷阱 ： 2.7  和  8.1/3 进行比较
         */
        double num1 = 2.7;
        double num2 = 8.1 / 3;
        // 2.7
        System.out.println(num1);
        // 2.6999999999999997  接近2.7的一个小数，不是2.7
        System.out.println(num2);
        if(num1 == num2){
            // 这里不执行
            System.out.println("相等");
        }
        /**
         * 正确的写法， 应该以两个数的差值的绝对值，在某个精度范围内判断
         */
        if(Math.abs(num1 - num2) < 0.0000001){
            System.out.println("差值非常小，到我的规定精度，认为相等。。。。。。");
        }
    }
}
