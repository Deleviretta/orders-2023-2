package pl.edu.wszib.orders.application;

import pl.edu.wszib.orders.api.order.OrderFacadeApi;
import pl.edu.wszib.orders.api.order.OrderResult;

public class OrderFacade implements OrderFacadeApi {
    @Override
    public OrderResult create() {
        return null;
    }

    @Override
    public OrderResult getById(String orderId) {
        return null;
    }

    @Override
    public OrderResult addProduct(String orderId, String productId) {
        return null;
    }

    @Override
    public OrderResult removeProduct(String orderId, String productId) {
        return null;
    }

    @Override
    public OrderResult increaseProductQuantity(String orderId, String productId) {
        return null;
    }

    @Override
    public OrderResult decreaseProductQuantity(String orderId, String productId) {
        return null;
    }

    @Override
    public OrderResult setProductQuantity(String orderId, String productId, Integer quantity) {
        return null;
    }
}
