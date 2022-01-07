package chapter03;

/**
 * 整型
 */
public class IntDetail {
    public static void main(String[] args) {
        /**
         * java 中尽量使用 int 类型的数字，如果实在是可能很大的数字，才使用long 的类型
         * bit 是计算机最小的存储单位。
         * byte 是计算机最基本的存储单元。 1 byte = 8 bit。
         */
        // 整数型, 4个字节，每个字节有 8个 bit位, 值的范围 [-2147483648,2147483647]
        int a = 10;
        /**
         * int n = 3 在内存中的字节是   00000000 00000000 00000000 00001010
         */
        // 长字节整型  最大值  2 的 64次方-1 , long 类型需要在后边加一个 小写或者大写的 l。
        // 值 的范围 [-9223372036854776000,9223372036854775999]
        long b =  34L;
        /**
         * long n = 3 在内存中的字节是   00000000 00000000 00000000 00000000 00000000 00000000 00000000 00011111
         */
        // byte  1字节，值的范围是  [- 128,127] ； 闭区间
        // c =  128, c = -129 是会报错的。
        byte c_max = - 128;
        byte c_min = 127;

        /**
         * byte n = 3 在内存中的字节是   00000011
         */
        // short 2 字节 ， 值的范围 [- 32768,32767]；
        // d = 92312 会报错
        short d_max = 32767;
        short d_min = - 32768;

        /**
         * short n = 3 在内存中的字节是   00000000 00000011
         */

    }
}
