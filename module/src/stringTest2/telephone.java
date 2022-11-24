package stringTest2;

public class telephone {
    public static void main(String[] args) {
        //1.获取一个手机号码
        String phoneNumber = "13112349468";
        //2.截取前三位
        String start = phoneNumber.substring(0, 3);
        //3.截取后四位
        String end = phoneNumber.substring(7);
        //4.拼接
        String result = start + "****" + end;
        System.out.println(result);
    }
}
