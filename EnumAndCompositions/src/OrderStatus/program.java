package OrderStatus;

import entities.Order;

import java.util.Date;

public class program {

    public static void main(String[] args){
        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
    }
    
}
