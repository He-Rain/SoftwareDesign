public class Main {
    public static void main(String[] args) {
        Cashier cashier = new Cashier();

        // 不打
        // 折，总价为100
        double totalPrice1 = cashier.calculateTotalPrice(100, 1, 0);
        System.out.println("不打折，应收商品总价：" + totalPrice1);

        // 按折扣率8折打折，总价为200
        double totalPrice2 = cashier.calculateTotalPrice(200, 2, 0.8);
        System.out.println("扣率8折，应收商品总价：" + totalPrice2);

        // 按比例返现满200减20，总价为300
        double totalPrice3 = cashier.calculateTotalPrice(300, 3, 20);
        System.out.println("按比例返现满200减20，应收商品总价：" + totalPrice3);
    }
}