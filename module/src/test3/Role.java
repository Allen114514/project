package test3;

import java.util.Random;

public class Role {
    public String name;
    public int blood;

    public Role() {

    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    //定义一个方法用于攻击别人
    //r1.攻击（r2）；
    //方法的调用者攻击参数
    public void attack(Role role) {
        //计算造成的伤害（1~20）
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        //剩余血量
        int remainBlood = role.getBlood() - hurt;
        //对血量做判断
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        //修改一下被打的人的血量
        role.setBlood(remainBlood);
        System.out.println(this.getName() + "举起拳头打了" + role.getName() + "一下，"
                + "造成了" + hurt + "点伤害，" + role.getName() + "还剩" + remainBlood + "点血");
    }
}
