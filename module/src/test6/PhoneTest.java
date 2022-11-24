package test6;

public class PhoneTest {
    public static void main(String[] args) {
        //1.创建一个数组
        Phone[] arr = new Phone[3];
        //2.创建手机的对象
        Phone p1 = new Phone("小米",1999,"紫色");
        Phone p2 = new Phone("iPhone",5999,"绿色");
        Phone p3 = new Phone("魅族",2999,"白色");
        //3.把手机对象添加到数组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        //4.获取三部手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }
        //5.求平均值
        int average = sum / arr.length;
        System.out.println(average);
    }
}
