package stringTest2;

public class transform {
    public static void main(String[] args) {
        //定义一个方法，把int数组中的数据按照指定的格式拼接成字符串返回，
        //调用该方法，并在控制台输出结果。
        //例如：数组为  int[] arr = {1,2,3};     输出结果为[1,2,3]
        int[] arr = {1, 2, 3};
        String str = arrToString(arr);
        System.out.println(str);
    }

    //定义方法
    public static String arrToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result += arr[i];
            } else {
                result += arr[i] + ", ";
            }
        }
        result += "]";
        return result;
    }
}
