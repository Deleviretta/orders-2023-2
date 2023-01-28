package pl.edu.wszib.orders.api.order;

import pl.edu.wszib.orders.api.ApiSuccess;

import java.math.BigDecimal;
import java.util.SortedSet;

public interface OrderApi extends ApiSuccess {
    String id();
    SortedSet<OrderItemApi> items();
    BigDecimal amount();
}
