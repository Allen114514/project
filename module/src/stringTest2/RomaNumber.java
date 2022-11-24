package stringTest2;

import java.util.Scanner;

public class RomaNumber {
    public static void main(String[] args) {
        /*键盘录入一个字符串，要求1：长度<=9    要求2：只能是数字
          将内容变为罗马数字
          ps：罗马数字没有0，内容中的0可变成""（长度为0的字符串）*/
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入字符串");
            str = sc.next();
            //2.校验字符串是否满足规则
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入的字符串不符合规则，请重新输入");
                continue;
            }
        }
        //将内容变成罗马数字（查表法，还可用switch语句替代）
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);//字符
            int number = c - 48;//字符-->数字
            String s = changeRoma(number);
            sb.append(s);
        }
        System.out.println(sb);
    }

    public static String changeRoma(int number) {
        String[] arr = {"", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr[number];
    }

    public static boolean checkStr(String str) {
        //长度<=9
        if (str.length() > 9) {
            return false;
        }
        //只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
                //只有字符串中的所有元素都判断完成后才能认为字符串符合规则
            }
        }
        return true;
    }
}
