package src;

/**
 * 三元操作符类型的转换规則：
 *
 * 若两个操作数不可转换，则不做转换，返回值为Object类型
 * 若两个操作数是明确类型的表达式（比如变量），則按照正常的二进制数字来转换，int 类型转换为long类型，long类型转换为float类型等
 * 若两个操作数中有一个是数字S,另外一个是表达式，且其类型为T,那么，若数字S在T的范围内，則转换为T类型；若S超出了T类型的范围，则T转换为S类
 */
public class TernaryConditionalOperator {
    public static void main(String[] args) {
        char alpha = 'A';
        int foo = 0;
        boolean trueExp = true;
        System.out.println(trueExp ? alpha : 0);
        System.out.println(trueExp ? alpha : foo);
    }
}
