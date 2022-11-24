package stringTest1;

import java.util.Scanner;

public class singIn {
    public static void main(String[] args) {
        //已知正确的用户名和密码，请用程序实现模拟用户登录。三次机会，登陆后
        // 给出相应的提示
        //1.定义两个变量记录正确的用户名和密码
        String rightUsername = "zhangsan";
        String rightPassword = "123456";
        //2.键盘录入用户名和密码        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            //3.比较
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("用户登录成功");
                break;
            } else {
                if (i == 2) {
                    System.out.println("账号" + rightUsername + "被锁定，请24小时候再次尝试");
                } else {
                    System.out.println("登录失败，用户名或密码有误,还可登录" + (2 - i) + "次");
                }
            }
        }
    }
}
