package stringTest2;

public class adjustStringCase2 {
    public static void main(String[] args) {
        /*给定两个字符串A和B，A的旋转操作就是将A最左边的字符移动到最右边
         例如，A="abcde",在移动一次后的结果是"bcdea"
         如果在若干次操作后A能变成B，则返回true，否则返回false*/
        //1.定义两个字符串
        String strA = "abcde";
        String strB = "cdeab";
        //2.调用方法进行比较
        boolean result = check(strA, strB);
        System.out.println(result);
    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);//A旋转若干次后能否和B相同
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    public static String rotate(String str) {
        //把字符串先变成一个字符数组，然后调整里面数据，最后再把数组变成字符串
        char[] arr = str.toCharArray();
        char first = arr[0];//拿到0索引上的字符
        //把剩余的字符往前挪一个位置
        for (int i = 1; i < str.length(); i++) {
            arr[i - 1] = arr[i];
        }
        //把0索引上的字符放到最后一个索引上
        arr[str.length() - 1] = first;
        //利用字符数组创建一个字符串对象
        String result = new String(arr);
        return result;
    }
}
