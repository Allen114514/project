package test1;

public class girlFriendTest {
    public static void main(String[] args) {
        //创建女朋友的对象
        girlFriend gf1 = new girlFriend();
        gf1.setName("小诗诗");
        gf1.setAge(19);
        gf1.setGender("女");
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());
        gf1.sleep();
        gf1.eat();
    }
}
