/**
 * @ClassName Cashier
 * @Author 何雨铭
 * @Date 2023/7/21 9:28
 */
//好好学习，走向巅峰！
public class Cashier {
    public double calculateTotalPrice(double sumPrice, int discountType, double discountValue) {
        double totalPrice = sumPrice;
        switch (discountType) {
            case 1:
                // 不打折
                break;
            case 2:
                // 按折扣率打折
                totalPrice *= discountValue;
                break;
            case 3:
                // 按比例返现
                totalPrice -= discountValue;
                break;
            default:
                // 默认不打折
                break;
        }
        return totalPrice;
    }
}
