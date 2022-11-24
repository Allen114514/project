package stringTest2;

public class splitString {
    public static void main(String[] args) {
        /*定义一个方法，把int数组中的数据按照指定的格式拼接成一个字符串返回。
          调用该方法，并在控制台输出结果
          例如：数组为int[] arr = {1,2,3};     输出[1, 2, 3]*/
        //1.定义数组
        int[] arr = {1, 2, 3};
        //2.调用方法
        String result = arrToString(arr);
        System.out.println(result);
    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
