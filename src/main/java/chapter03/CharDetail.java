package chapter03;

/**
 * 字符类型
 */
public class CharDetail {
    public static void main(String[] args) {
        /**
         * char 是 单个字符常量, 只能存储单个字符、转义字符、数字, char 的本质是一个整数，在输出时，是unicode码对应的字符。
         * 要输出数字
         */
        char a = '韩';
        // 会将 7 转换为对应的 ASIC 码
        char n = 97;
        // 转移
        char sd = '\n';

        System.out.println((int)a);
        // 输出 a ， 因为 97 对应的字符是 a ， 而 a 对应的是 97
        System.out.println(n);
        System.out.println(sd);

        /**
         * char 类型可以运算，本质是一个数字
         * System.out.println(a + 101); 输出 38990
         */
        System.out.println(a + 101);

        /**
         * 总结： char 类型，本质就是一个数字，对应的是 unicode 表上的顺序。
         * 如果是一个字符串， 那么会返回一个数字，  如果是一个数字，那么返回数字对应的字符串。 可以将返回的字符串转化为数字 (int)a
         * 存储：计算机存储char 类型 实际上也是先将字符对应的码值（整数）找出来， 然后转为二进制后存储
         * 读取：二进制 -> 转化为 十进制 -> unicode 表查找字符   显示
         */

        /**
         * 字符和码值的对应关系
         * ASCII 编码表，一个字节表示，只占用后7位的bit位。 一共 128个字符， 实际上一个字节可以表示 256个字符，但是只用了128个字符。
         * Unicode 编码表， 固定大小的编码，使用两个字节标识字符， 字母和汉字都占用两个字节表示，缺点：浪费空间，最大字符是 65536 。Unicode
         * 表是兼容 ASCII 表的。
         * utf-8 编码表，大小可变  ， 字母使用1个字节，汉字使用3个字节，对Unicode表的改进，使用最广泛 。
         * gbk 编码表，多用于表示汉字， 字母使用1个字节， 汉字使用2个字节。
         * gb2312 编码表，可以表示汉字，  gb2312 < gbk
         * big5  编码表，（繁体中文，台湾，香港）
         */
    }
}
