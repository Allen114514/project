package stringTest1;

import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，
        // 数字字符出现的次数

        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        //定义三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("小写字母字符有" + smallCount + "个");
        System.out.println("大写字母字符有" + bigCount + "个");
        System.out.println("数字字符有" + numberCount + "个");
        System.out.println("其他字符有" + otherCount + "个");
    }
}
