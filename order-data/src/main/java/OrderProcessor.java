import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
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

        Type listType = new TypeToken<List<Order>>() {}.getType();
        return gson.fromJson(json, listType);
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
