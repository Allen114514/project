package stringTest2;

public class reverser {
    public static void main(String[] args) {
        //定义一个方法，实现字符串反转
        //键盘录入一个字符串，调用该方法后，在控制台输出结果
        //例如：录入abc，输出cba
        String s = reverse("abc");
        System.out.println(s);
    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }
}
