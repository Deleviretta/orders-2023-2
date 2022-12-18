package pl.edu.wszib.orders.api.order;

import java.math.BigDecimal;
import java.util.SortedSet;

public interface OrderApi {
    String id();
    SortedSet<OrderItemApi> items();
    BigDecimal amount();
}
