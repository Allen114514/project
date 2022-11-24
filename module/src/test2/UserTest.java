package test2;

public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        u.setUsername("20211301023");
        u.setPassword("123456789");
        u.setEmail("3514417819@qq.com");
        u.setGender("男");
        u.setAge(19);
        System.out.println(u.getUsername());
        System.out.println(u.getPassword());
        System.out.println(u.getEmail());
        System.out.println(u.getGender());
        System.out.println(u.getAge());
    }
}
