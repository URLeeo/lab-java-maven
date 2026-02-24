import java.util.List;

public class OrderCalculator {
    public static void main(String[] args){
        List<Order> orders = OrderProcessor.readOrders();

        double totalSum = 0;
        for(Order order : orders){
            totalSum += order.total;
        }

        System.out.println("Total Sum : " + totalSum);
        System.out.println("Orders over 45: ");

        for (Order order : orders){
            if (order.total >= 45){
                System.out.println("Order ID: " + order.orderId);
            }
        }
    }
}
