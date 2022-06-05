package Java_转义字符;

//演示转义字符的使用
public class ChangeChar {

    public static void main(String[] args) {
//        \t  : 一个制表位,实现对齐的功能
        System.out.println("北京\t天津\t上海");
//        \n  : 换行符
        System.out.println("jack\nsmith\nmary");
//        \\  : 一个\
        System.out.println("C:\\\\Window\\System32\\cmd.exe");
//        \"  : 一个"
        System.out.println("老韩说:\"要好好学习Java,有前途\"");
//        \'  : 一个'
        System.out.println("老韩说:\'要好好学习Java,有前途\'");
//        \r  : 一个回车
        System.out.println("韩顺平教育\r北京");

        System.out.println("书名\t作者\t\t价格\t销量");
        System.out.println("三国\t罗贯中\t120\t1000");

        System.out.println("书名\t作者\t\t价格\t销量\n三国\t罗贯中\t120\t1000");
    }

}
