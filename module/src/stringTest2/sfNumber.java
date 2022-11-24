package stringTest2;

public class sfNumber {
    public static void main(String[] args) {
        //7~14位，出生年月日   17位：性别（奇数男偶数女）
        //人物信息为：出生年月日：xx年xx月xx日     性别为：男/女
        //1.定义一个字符串记录身份证号码
        String id = "321853202103032996";
        //2.获取出生年月日
        String year = id.substring(6, 10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println("人物信息为：");
        System.out.println(year + "年" + month + "月" + day + "日");
        //3.获取性别
        char gender = id.charAt(16); //拿到的是字符'3'
        //System.out.println('0'+0); ---> 48
        //System.out.println('3'-48); ---> 3
        int number = gender - 48;
        if (number % 2 == 0){
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }

    }
}
