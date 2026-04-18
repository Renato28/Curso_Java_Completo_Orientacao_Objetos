package exemplo_enum.application;

import exemplo_enum.Order;
import exemplo_enum.enums.OrderStatus;

import java.util.Date;

public class Program {

    static void main() {

        Order order = new Order(100, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
