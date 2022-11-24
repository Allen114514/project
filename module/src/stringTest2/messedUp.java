package stringTest2;

import java.util.Random;
import java.util.Scanner;

public class messedUp {
    public static void main(String[] args) {
        //键盘输入任意字符串，打乱其中的内容
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        //2.变成字符数组
        char[] arr = str.toCharArray();
        //3.打乱数组中的元素
        //从0索引开始，每一个元素跟一个随机索引交换位置
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //4.把字符数组再变回字符串
        String result = new String(arr);
        System.out.println(result);
    }
}
