package stringTest2;

public class 敏感词替换 {
    public static void main(String[] args) {
        //1.获取说的话
        String talk = "你TM玩你妈呢傻逼，cnm的";
        //2.定义一个敏感词库
        String[] arr = {"TM","tm","你妈","傻逼","cnm","tmd","CNM","TMD"};
        //3.循环得到数组中的每一个敏感词，依次进行替换
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}
