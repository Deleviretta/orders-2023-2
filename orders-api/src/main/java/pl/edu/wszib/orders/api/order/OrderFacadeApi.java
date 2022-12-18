package pl.edu.wszib.orders.api.order;

public interface OrderFacadeApi {
    OrderResult create(OrderCreateApi orderCreate);
    OrderResult get(String orderId);
    OrderResult addProduct(String orderId, String productId);
    OrderResult removeProduct(String orderId, String productId);
    OrderResult increaseProductQuantity(String orderId, String productId);
    OrderResult decreaseProductQuantity(String orderId, String productId);
    OrderResult setProductQuantity(String orderId, String productId, Integer quantity);
}
