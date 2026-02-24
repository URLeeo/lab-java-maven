import com.google.gson.Gson;
import java.util.Arrays;
import java.util.List;


public class OrderProcessor {

    public static List<Order> readOrders(){
        String json = """
        [
          {
            "orderId": "1",
            "customer": "Leo",
            "items": [
              { "name": "Keyboard", "quantity": 1, "price": 50 }
            ],
            "total": 50
          },
          {
            "orderId": "2",
            "customer": "Lion",
            "items": [
              { "name": "Laptop", "quantity": 1, "price": 1500 }
            ],
            "total": 65
          },
          {
            "orderId": "3",
            "customer": "Aslan",
            "items": [
              { "name": "Mouse", "quantity": 2, "price": 20 }
            ],
            "total": 40
          }
        ]
        """;

        Gson gson = new Gson();
        Order[] arr = gson.fromJson(json, Order[].class);

        return Arrays.asList(arr);
    }

    public static void main(String[] args){
        List<Order> orders = readOrders();

        for(Order order : orders){
            System.out.println("Order ID: " + order.orderId);
            System.out.println("Customer: " + order.customer);
            System.out.println("Total: " + order.total);
            System.out.println("-------------");
        }
    }
}
