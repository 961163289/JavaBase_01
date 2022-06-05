package Java断言;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的年龄:");

        int value = scanner.nextInt();
        assert value>=18:"不合法";

        System.out.println("输入值为:"+value);
    }

}
