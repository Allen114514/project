package test4;

public class GoodsTest {
    public static void main(String[] args) {
        //1.创建一个数组（3个商品对象）
        Goods[] arr = new Goods[3];
        //2.创建3个商品对象
        Goods g1 = new Goods("001", "一盒子弹", 200.00, 100);
        Goods g2 = new Goods("002", "格洛克", 2200.00, 50);
        Goods g3 = new Goods("003", "防弹衣", 5600.00, 10);
        //3.把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        //4.遍历
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+goods.getCount());
        }
    }
}
